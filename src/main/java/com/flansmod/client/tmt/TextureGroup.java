package com.flansmod.client.tmt;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;

public class TextureGroup
{
	private String cachedTexture = "";
	private ResourceLocation cachedTextureLocation;

	public TextureGroup()
	{
		poly = new ArrayList<TexturedPolygon>();
		texture = "";
	}
	
	public void addPoly(TexturedPolygon polygon)
	{
		poly.add(polygon);
	}

	public void loadTexture()
	{
		loadTexture(-1);
	}
	
	public void loadTexture(int defaultTexture)
	{
		if(!texture.equals(""))
		{
			if(cachedTextureLocation == null || !texture.equals(cachedTexture))
			{
				cachedTexture = texture;
				cachedTextureLocation = new ResourceLocation("", texture);
			}
			TextureManager renderengine = RenderManager.instance.renderEngine;
			renderengine.bindTexture(cachedTextureLocation);
		}
		else if(defaultTexture > -1)
		{
			RenderManager.instance.renderEngine.bindTexture(new ResourceLocation("", ""));
		}
	}
	
	public ArrayList<TexturedPolygon> poly;
	public String texture;
}
