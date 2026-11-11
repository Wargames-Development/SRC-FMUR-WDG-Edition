#define GL_SILENCE_DEPRECATION
#include <OpenGL/OpenGL.h>
#include <OpenGL/gl.h>
#include <OpenGL/glext.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

static GLuint program;
static int checks;
static void require(int ok, const char *name) {
    if (!ok) { fprintf(stderr, "FAIL %s (GL %x)\n", name, glGetError()); exit(1); }
    checks++;
}
static GLuint shader(GLenum type, const char *path) {
    FILE *file = fopen(path, "rb"); require(file != NULL, "shader source exists");
    fseek(file, 0, SEEK_END); long size = ftell(file); rewind(file);
    char *source = calloc(size + 1, 1); require(fread(source, 1, size, file) == size, "read production source"); fclose(file);
    GLuint result = glCreateShader(type); const char *text = source;
    glShaderSource(result, 1, &text, NULL); glCompileShader(result); free(source);
    GLint ok; glGetShaderiv(result, GL_COMPILE_STATUS, &ok);
    if (!ok) { char log[4096]; glGetShaderInfoLog(result, sizeof(log), NULL, log); fprintf(stderr, "%s\n", log); }
    require(ok, "production shader compiles"); return result;
}
static GLuint texture(int depth, int width) {
    GLuint result; glGenTextures(1, &result); glBindTexture(GL_TEXTURE_2D, result);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
    glTexImage2D(GL_TEXTURE_2D, 0, depth ? GL_DEPTH_COMPONENT24 : GL_RGBA8, width, width, 0,
        depth ? GL_DEPTH_COMPONENT : GL_RGBA, GL_UNSIGNED_BYTE, NULL); return result;
}
static void integer(const char *name, int value) { glUniform1i(glGetUniformLocation(program, name), value); }
static void scalar(const char *name, float value) { glUniform1f(glGetUniformLocation(program, name), value); }
int main(int argc, char **argv) {
    require(argc == 3, "shader paths supplied");
    CGLPixelFormatAttribute attributes[] = {kCGLPFAAccelerated, kCGLPFAColorSize, 24, kCGLPFADepthSize, 24, 0};
    CGLPixelFormatObj format; CGLContextObj context; GLint count;
    require(CGLChoosePixelFormat(attributes, &format, &count) == kCGLNoError, "choose legacy GLSL120 context");
    require(CGLCreateContext(format, NULL, &context) == kCGLNoError, "create offscreen context");
    CGLDestroyPixelFormat(format); CGLSetCurrentContext(context);
    program = glCreateProgram(); glAttachShader(program, shader(GL_VERTEX_SHADER, argv[1]));
    glAttachShader(program, shader(GL_FRAGMENT_SHADER, argv[2]));
    glBindAttribLocation(program, 0, "cameraPosition"); glBindAttribLocation(program, 1, "cameraColor");
    glBindAttribLocation(program, 2, "cameraMaterial"); glLinkProgram(program);
    GLint linked; glGetProgramiv(program, GL_LINK_STATUS, &linked); require(linked, "production terrain program links");
    glUseProgram(program);
    integer("lightMap", 1); integer("blockAtlas", 2); integer("useAtlas", 0); integer("nativeCoverage", 3);
    scalar("clipDistance", 0); scalar("transitionStart", 112); scalar("worldZ", 0); scalar("worldOffset", 0);
    glUniform2f(glGetUniformLocation(program, "inverseViewSize"), .25f, .25f);
    glActiveTexture(GL_TEXTURE1); GLuint light = texture(0, 1); unsigned char white[] = {255,255,255,255};
    glTexSubImage2D(GL_TEXTURE_2D, 0, 0, 0, 1, 1, GL_RGBA, GL_UNSIGNED_BYTE, white);
    glActiveTexture(GL_TEXTURE0);
    GLuint fbo, depth = texture(1, 4), colour = texture(0, 4), coverage = texture(1, 4);
    glGenFramebuffersEXT(1, &fbo); glBindFramebufferEXT(GL_FRAMEBUFFER_EXT, fbo);
    glFramebufferTexture2DEXT(GL_FRAMEBUFFER_EXT, GL_COLOR_ATTACHMENT0_EXT, GL_TEXTURE_2D, colour, 0);
    glFramebufferTexture2DEXT(GL_FRAMEBUFFER_EXT, GL_DEPTH_ATTACHMENT_EXT, GL_TEXTURE_2D, depth, 0);
    glDrawBuffer(GL_COLOR_ATTACHMENT0_EXT); glReadBuffer(GL_COLOR_ATTACHMENT0_EXT);
    require(glCheckFramebufferStatusEXT(GL_FRAMEBUFFER_EXT) == GL_FRAMEBUFFER_COMPLETE_EXT, "complete private scope framebuffer");
    glViewport(0,0,4,4); glMatrixMode(GL_PROJECTION); glLoadIdentity(); glMatrixMode(GL_MODELVIEW); glLoadIdentity();
    float vertices[] = {-1,-1,-.2f,0, 1,-1,-.2f,0, 1,1,-.2f,0, -1,-1,-.2f,0, 1,1,-.2f,0, -1,1,-.2f,0};
    glVertexAttribPointer(0,4,GL_FLOAT,GL_FALSE,0,vertices); glEnableVertexAttribArray(0);
    glVertexAttrib4f(1,.5f,.25f,.125f,1); glVertexAttrib4f(2,0,0,0,0);
    glEnable(GL_DEPTH_TEST); glDepthFunc(GL_LEQUAL); glDepthMask(GL_TRUE);
    for (int phase = 0; phase < 8; phase++) for (int enabled = 0; enabled < 2; enabled++) {
        glDisable(GL_SCISSOR_TEST); glClearDepth(1); glClear(GL_DEPTH_BUFFER_BIT);
        // Alternate the native silhouette, including a fully absent native column.
        int edge = phase % 3 + 1;
        glEnable(GL_SCISSOR_TEST); glScissor(0,0,edge,4); glClearDepth(.75); glClear(GL_DEPTH_BUFFER_BIT); glDisable(GL_SCISSOR_TEST);
        glActiveTexture(GL_TEXTURE3); glBindTexture(GL_TEXTURE_2D, coverage);
        glCopyTexSubImage2D(GL_TEXTURE_2D,0,0,0,0,0,4,4);
        // A separate snapshot must survive subsequent depth changes and never alias the output.
        glClearDepth(.9); glClearColor(.2f,.4f,.6f,1); glClear(GL_DEPTH_BUFFER_BIT|GL_COLOR_BUFFER_BIT);
        integer("useNativeCoverage", enabled); glDrawArrays(GL_TRIANGLES,0,6);
        for (int x=0;x<4;x++) {
            float pixel[4], value; glReadPixels(x,2,1,1,GL_RGBA,GL_FLOAT,pixel);
            glReadPixels(x,2,1,1,GL_DEPTH_COMPONENT,GL_FLOAT,&value);
            int owned = enabled && x < edge;
            require(fabsf(pixel[0]-(owned?.2f:.5f))<.005f, "native colour wins overlap; empty pixels retain LOD terrain");
            require(fabsf(value-(owned?.9f:.5f))<.00001f, "masked LOD cannot overwrite native depth");
        }
        require(glGetError()==GL_NO_ERROR,"coverage snapshot and production draw have no GL errors");
    }
    printf("PASS %d scope terrain OpenGL checks using production GLSL\n", checks);
    glDeleteTextures(1,&light); CGLSetCurrentContext(NULL); CGLDestroyContext(context); return 0;
}
