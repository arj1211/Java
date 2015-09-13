package data;

import helpers.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

import static org.lwjgl.opengl.GL11.*;
import static helpers.Artist.*;

public class Boot {

	public Boot() {

		beginSession();

		/*
		 * 0: grass
		 * 1: dirt
		 * 2: water
		 * 
		 * This is the level map
		 */
		
		
		
	//	GameManager game = new GameManager(map);
		while (!Display.isCloseRequested()) {
			Clock.update();
			
		//	game.update();
			StateManager.update();
			Display.update();
			Display.sync(60);
		}

		Display.destroy();

	}

	public static void main(String[] args) {
		new Boot();
	}

}
