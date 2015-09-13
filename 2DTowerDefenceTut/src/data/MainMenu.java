package data;

import helpers.StateManager;
import helpers.StateManager.GameState;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.opengl.Texture;

import ui.UI;
import static helpers.Artist.*;

public class MainMenu {

	private Texture background;
	private UI menuUI;

	public MainMenu() {
		background = quickLoadTex("mainmenu");
		menuUI = new UI();
		menuUI.addButton("Play", "playbutton", WIDTH / 2 - 128,
				(int) (HEIGHT * .45f));
		menuUI.addButton("Editor", "editorbutton", WIDTH / 2 - 128,
				(int) (HEIGHT * .55f));
		menuUI.addButton("Quit", "quitbutton", WIDTH / 2 - 128,
				(int) (HEIGHT * .65f));

	}

	private void updateButtons() {
		if (Mouse.isButtonDown(0)) {
			if (menuUI.isButtonClicked("Play"))
				StateManager.setState(GameState.GAME);
			if (menuUI.isButtonClicked("Editor"))
				StateManager.setState(GameState.EDITOR);
			if (menuUI.isButtonClicked("Quit"))
				System.exit(0);
		}
	}

	public void update() {
		drawQuadTex(background, 0, 0, 2048, 1024);
		menuUI.draw();
		updateButtons();
	}

}
