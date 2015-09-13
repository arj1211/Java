package helpers;

import data.*;

public class StateManager {

	public static enum GameState {
		MAINMENU, GAME, EDITOR
	}

	public static GameState gameState = GameState.MAINMENU;
	public static MainMenu mainMenu;
	public static GameManager game;
	public static Editor editor;
	static int[][] map = {
			{0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,2,2,2,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0},
			{0,0,2,2,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0},
			{0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0},
			{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};
	public static void update() {
		switch (gameState) {
		case MAINMENU:
			if (mainMenu == null)
				mainMenu = new MainMenu();
			mainMenu.update();
			break;

		case GAME:
			if (game == null)
				game = new GameManager(map);
			game.update();
			break;

		case EDITOR:
			if (editor == null)
				editor = new Editor();
			editor.update();
			break;
		}
	}

	public static void setState(GameState newState) {
		gameState = newState;
	}
}
