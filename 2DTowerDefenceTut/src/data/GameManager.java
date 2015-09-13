package data;

import static helpers.Artist.*;

public class GameManager {
	
	
	private TileGrid grid;
	private Player player;
	private WaveManager waveManager;
	public static final int TILE_SIZE= 64;
	
	
	public GameManager(int[][] map){
		grid=new TileGrid(map);
		
		waveManager = new WaveManager(new Enemy(quickLoadTex("enemy"),grid.getTile(10,10),grid,64,64,100),
				2,3);
		player = new Player(grid, waveManager);
		
	}
	
	public void update(){
		grid.draw();
		waveManager.update();
		player.update();
		
	}
	
	
}
