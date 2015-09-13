package data;

import static helpers.Artist.*;
import helpers.Clock;

import org.lwjgl.input.*;

public class Editor {

	private TileGrid grid;
	private int index;
	private TileType[] types;

	public Editor() {
		this.grid = new TileGrid();
		this.index = 0;
		this.types[0] = TileType.Grass;
		this.types[1] = TileType.Dirt;
		this.types[2] = TileType.Water;
	}

	public void update() {
		grid.draw();
		// handle mouse input
		if (Mouse.isButtonDown(0))
			setTile();

		// handle keyborad input
		while (Keyboard.next()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT
					&& Keyboard.getEventKeyState())
				moveIndex();
			if (Keyboard.getEventKey() == Keyboard.KEY_LEFT
					&& Keyboard.getEventKeyState()) {
			}

		}
	}

	private void setTile() {
		grid.setTile((int) Math.floor(Mouse.getX() / 64),
				(int) Math.floor((HEIGHT - Mouse.getY() - 1) / 64),
				types[index]);
	}

	private void moveIndex() {
		index++;
		if (index > types.length - 1)
			index = 0;

	}
}
