package helpers;

import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;
import java.io.InputStream;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Artist {

	public static final int WIDTH = 1280, HEIGHT = 920;

	// starts the game window vvv
	public static void beginSession() {
		Display.setTitle("2DTut");
		try {
			Display.setDisplayMode(new DisplayMode(600, 400));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, WIDTH, HEIGHT, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
	}

	public static void drawQuad(float x, float y, float width, float height) {
		glBegin(GL_QUADS);
		glVertex2f(x, y);// top left
		glVertex2f(x + width, y);// top right
		glVertex2f(x + width, y + height);// bottom right
		glVertex2f(x, y + height);// bottom left
		glEnd();
	}

	public static void drawQuadTex(Texture tex, float x, float y, float width,
			float height) {
		tex.bind();
		glTranslatef(x, y, 0);
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(width, 0);
		glTexCoord2f(1, 1);
		glVertex2f(width, height);
		glTexCoord2f(0, 1);
		glVertex2f(0, height);
		glEnd();
		glLoadIdentity();

	}

	
	public static void drawQuadTexRot(Texture tex, float x, float y, float width,
			float height, float angle) {
		tex.bind();
		glTranslatef(x+width/2, y+height/2, 0);
		glRotatef(angle, 0, 0, 1);
		glTranslatef(-width/2, -height/2, 0);
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(width, 0);
		glTexCoord2f(1, 1);
		glVertex2f(width, height);
		glTexCoord2f(0, 1);
		glVertex2f(0, height);
		glEnd();
		glLoadIdentity();

	}
		
	// loads a texture from a path
	public static Texture loadTexture(String path, String type) {
		Texture tex = null;
		InputStream in = ResourceLoader.getResourceAsStream(path);
		try {
			tex = TextureLoader.getTexture(type, in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tex;

	}

	// loads texture faster/easier
	public static Texture quickLoadTex(String name) {
		Texture tex = null;
		tex = loadTexture("res/" + name + ".png", "png");
		return tex;
	}

}
