package data;

import static helpers.Artist.*;
import helpers.Clock;

import java.util.ArrayList;

import org.lwjgl.input.*;

public class Player {

	private TileGrid grid;
	private TileType[] types;
	private int index;
	private WaveManager waveManager;
	private ArrayList<TowerCannon> towerList;
	private boolean leftMouseButtonDown;
	
	public Player(TileGrid grid, WaveManager waveManager) {
		this.grid = grid;
		this.types = new TileType[3];
		this.types[0] = TileType.Grass;
		this.types[1] = TileType.Dirt;
		this.types[2] = TileType.Water;
		this.index = 0;
		this.waveManager=waveManager;
		this.towerList=new ArrayList<TowerCannon>();
		this.leftMouseButtonDown=false;
	}

	

	public void update() {
		
		for (TowerCannon t : towerList)
			t.update();
		
		
		
		//handle mouse input
		if (Mouse.isButtonDown(0) && !leftMouseButtonDown)
			towerList.add(new TowerCannon(quickLoadTex("cannonBase"), grid.getTile(Mouse.getX()/64, (HEIGHT-Mouse.getY()-1)/64), 10, waveManager.getCurrentWave().getEnemyList()));
			//setTile();
		leftMouseButtonDown=Mouse.isButtonDown(0);
		
		//handle keyborad input
		while (Keyboard.next()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT
					&& Keyboard.getEventKeyState())
				Clock.changeMultiplier(0.2f);
			if (Keyboard.getEventKey() == Keyboard.KEY_LEFT
					&& Keyboard.getEventKeyState())
				Clock.changeMultiplier(-0.2f);
			if (Keyboard.getEventKey() == Keyboard.KEY_T
					&& Keyboard.getEventKeyState())
				towerList.add(new TowerCannon(quickLoadTex("cannonBase"), grid.getTile(17, 5), 10, waveManager.getCurrentWave().getEnemyList()));
		}
	}

	

}
