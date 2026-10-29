package com.flansmod.client.compat;

import com.flansmod.client.CameraTerrain;
import com.flansmod.client.CameraView;
import com.gtnewhorizons.angelica.rendering.celeritas.CeleritasWorldRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.embeddedt.embeddium.impl.gl.device.CommandList;
import org.embeddedt.embeddium.impl.gl.device.RenderDevice;
import org.embeddedt.embeddium.impl.render.chunk.ChunkRenderMatrices;
import org.embeddedt.embeddium.impl.render.chunk.DefaultChunkRenderer;
import org.embeddedt.embeddium.impl.render.chunk.RenderPassConfiguration;
import org.embeddedt.embeddium.impl.render.chunk.RenderSection;
import org.embeddedt.embeddium.impl.render.chunk.lists.ChunkRenderList;
import org.embeddedt.embeddium.impl.render.chunk.lists.ChunkRenderListIterable;
import org.embeddedt.embeddium.impl.render.chunk.data.SectionRenderDataStorage;
import org.embeddedt.embeddium.impl.render.chunk.multidraw.BatchAssembler;
import org.embeddedt.embeddium.impl.render.chunk.multidraw.CachedBatch;
import org.embeddedt.embeddium.impl.gl.tessellation.GlTessellation;
import org.embeddedt.embeddium.impl.render.chunk.region.RenderRegion;
import org.embeddedt.embeddium.impl.render.chunk.shader.ChunkShaderInterface;
import org.embeddedt.embeddium.impl.render.chunk.shader.ChunkShaderTextureSlot;
import org.embeddedt.embeddium.impl.render.chunk.shader.ChunkShaderOptions;
import org.embeddedt.embeddium.impl.render.chunk.shader.DefaultChunkShaderInterface;
import org.embeddedt.embeddium.impl.gl.shader.GlProgram;
import org.embeddedt.embeddium.impl.gl.shader.GlShader;
import org.embeddedt.embeddium.impl.gl.shader.ShaderParser;
import org.embeddedt.embeddium.impl.gl.shader.ShaderType;
import org.embeddedt.embeddium.impl.render.shader.ShaderLoader;
import org.embeddedt.embeddium.impl.render.chunk.terrain.TerrainRenderPass;
import org.embeddedt.embeddium.impl.render.viewport.CameraTransform;

/** Private draw lists/programs over the live renderer's uploaded mesh buffers. */
public final class AngelicaCameraTerrain implements CameraTerrain, ChunkRenderListIterable {
    private final List<ChunkRenderList> lists = new ArrayList<>();
    private final Map<RenderRegion, ChunkRenderList> byRegion = new IdentityHashMap<>();
    private final List<RenderSection> visible = new ArrayList<>();
    private CameraChunkRenderer renderer;
    private RenderPassConfiguration<?> configuration;
    private ChunkRenderMatrices matrices;
    private CameraTransform camera;
    private CommandList commands;
    private boolean managed;

    @Override public boolean begin(final CameraView view) {
        CeleritasWorldRenderer world = CeleritasWorldRenderer.getInstanceOrNull();
        if (world == null || world.getRenderSectionManager() == null) return false;
        RenderDevice.enterManagedCode(); managed = true;
        commands = RenderDevice.INSTANCE.createCommandList();
        RenderPassConfiguration<?> next = world.getRenderPassConfiguration();
        if (configuration != next) {
            if (renderer != null) renderer.delete(commands);
            configuration = next;
            renderer = new CameraChunkRenderer(next);
        }
        lists.clear(); byRegion.clear(); visible.clear();
        for (RenderSection section : world.getRenderSectionManager().getAllRenderSections()) {
            if (!section.isBuilt() || section.isDisposed() || !section.getBuiltContext().hasBlockGeometry) continue;
            if (!view.visible(section.getOriginX(), section.getOriginY(), section.getOriginZ(),
                    section.getOriginX() + 16, section.getOriginY() + 16, section.getOriginZ() + 16)) continue;
            visible.add(section);
        }
        Collections.sort(visible, new Comparator<RenderSection>() {
            @Override public int compare(RenderSection a, RenderSection b) {
                return Double.compare(sectionDistance(a, view), sectionDistance(b, view));
            }
        });
        for (RenderSection section : visible) {
            ChunkRenderList list = byRegion.get(section.getRegion());
            if (list == null) {
                list = new ChunkRenderList(section.getRegion());
                byRegion.put(section.getRegion(), list); lists.add(list);
            }
            list.add(section.getSectionIndex(), section.getBuiltContext().getVisualBitmaskForSection());
        }
        Collections.sort(lists, new Comparator<ChunkRenderList>() {
            @Override public int compare(ChunkRenderList a, ChunkRenderList b) {
                return Double.compare(distance(a.getRegion(), view), distance(b.getRegion(), view));
            }
        });
        matrices = new ChunkRenderMatrices(view.projection, view.modelView);
        camera = new CameraTransform(view.x, view.y, view.z);
        return true;
    }

    private static double sectionDistance(RenderSection section, CameraView view) {
        double x = section.getCenterX() - view.x, y = section.getCenterY() - view.y, z = section.getCenterZ() - view.z;
        return x * x + y * y + z * z;
    }

    private static double distance(RenderRegion region, CameraView view) {
        double x = region.getCenterX() - view.x, y = region.getCenterY() - view.y, z = region.getCenterZ() - view.z;
        return x * x + y * y + z * z;
    }

    @Override public void draw(int pass) {
        for (TerrainRenderPass terrainPass : (Iterable<TerrainRenderPass>)configuration.getAllKnownRenderPasses()::iterator) {
            if (terrainPass.isReverseOrder() != (pass == 1)) continue;
            renderer.render(matrices, commands, this, terrainPass, camera, camera);
        }
    }

    @Override public void close() {
        try {
            if (commands != null) {
                if (renderer != null) renderer.releaseDraws(commands);
                commands.close();
            }
        }
        finally {
            commands = null;
            if (managed) RenderDevice.exitManagedCode();
            managed = false;
            lists.clear(); byRegion.clear(); visible.clear();
        }
    }

    @Override public void destroy() {
        close();
        if (renderer == null) return;
        RenderDevice.enterManagedCode();
        try (CommandList commands = RenderDevice.INSTANCE.createCommandList()) { renderer.delete(commands); }
        finally { RenderDevice.exitManagedCode(); renderer = null; configuration = null; }
    }

    @Override public Iterator<ChunkRenderList> iterator(boolean reverse) {
        if (!reverse) return lists.iterator();
        return new Iterator<ChunkRenderList>() {
            private int index = lists.size();
            @Override public boolean hasNext() { return index > 0; }
            @Override public ChunkRenderList next() { return lists.get(--index); }
        };
    }
    @Override public int getNumRegions() { return lists.size(); }
    @Override public ChunkRenderList getRegion(int index) { return lists.get(index); }

    private static String withoutMissingCorrection(String source) {
        // Iris omits a_RdhFactor. Its attribute location can otherwise alias packed mid-UV data.
        String assignment = "_vert_rdh_factor = a_RdhFactor;";
        if (!source.contains(assignment)) throw new IllegalStateException("Unsupported terrain AO decoder");
        return source.replace(assignment, "_vert_rdh_factor = vec4(0.0);");
    }

    private static final class CameraChunkRenderer extends DefaultChunkRenderer {
        private final List<CachedBatch> batches = new ArrayList<>();
        private final List<GlTessellation> tessellations = new ArrayList<>();
        CameraChunkRenderer(RenderPassConfiguration<?> configuration) { super(RenderDevice.INSTANCE, configuration); }
        @Override protected boolean useBlockFaceCulling() { return false; }
        @Override protected GlProgram<ChunkShaderInterface> compileProgram(ChunkShaderOptions options) {
            GlProgram<ChunkShaderInterface> program = super.compileProgram(options);
            if (program == null) throw new IllegalStateException("Camera terrain material failed to compile");
            return program;
        }
        @Override protected GlProgram<ChunkShaderInterface> createShader(String path, ChunkShaderOptions options) {
            if (options.pass().vertexType().getVertexFormat().getAttributes().stream()
                    .anyMatch(attribute -> attribute.getName().equals("a_RdhFactor")))
                return super.createShader(path, options);
            GlShader vertex = null, fragment = null;
            try {
                String source = ShaderParser.parseShader(ShaderLoader.getShaderSource("sodium:" + path + ".vsh"),
                        ShaderLoader::getShaderSource, options.constants());
                vertex = new GlShader(ShaderType.VERTEX, "fmur:camera_terrain", withoutMissingCorrection(source));
                fragment = ShaderLoader.loadShader(ShaderType.FRAGMENT, "sodium:" + path + ".fsh", options.constants());
                GlProgram.Builder builder = GlProgram.builder("fmur:camera_terrain");
                builder.attachShader(vertex); builder.attachShader(fragment);
                int location = 0;
                for (org.embeddedt.embeddium.impl.gl.attribute.GlVertexAttribute attribute
                        : options.pass().vertexType().getVertexFormat().getAttributes())
                    builder.bindAttribute(attribute.getName(), location++);
                builder.bindFragmentData("fragColor", 0);
                return builder.link(context -> new DefaultChunkShaderInterface(context, options));
            } finally {
                if (vertex != null) vertex.delete();
                if (fragment != null) fragment.delete();
            }
        }
        @Override protected void configureShaderInterface(ChunkShaderInterface shader) {
            shader.setTextureSlot(ChunkShaderTextureSlot.BLOCK, 0);
            shader.setTextureSlot(ChunkShaderTextureSlot.LIGHT, 1);
        }

        @Override protected GlTessellation prepareTessellation(CommandList commands, RenderRegion region, TerrainRenderPass pass) {
            GlTessellation tessellation = createRegionTessellation(commands, region.getResources());
            tessellations.add(tessellation);
            return tessellation;
        }

        @Override protected CachedBatch getRegionBatch(CommandList commands, RenderRegion region,
                SectionRenderDataStorage storage, ChunkRenderList list, CameraTransform camera,
                TerrainRenderPass pass, boolean cull, SectionRenderDataStorage.BatchCacheParams params) {
            // Never put secondary visibility, VAOs or private index-buffer references in primary caches.
            CachedBatch batch = BatchAssembler.createCachedBatch(region, storage, list, camera, pass, cull,
                    commands, this::prepareTessellation);
            batches.add(batch);
            return batch;
        }

        void releaseDraws(CommandList commands) {
            for (CachedBatch batch : batches) batch.delete();
            for (GlTessellation tessellation : tessellations) tessellation.delete(commands);
            batches.clear(); tessellations.clear();
        }
    }
}
