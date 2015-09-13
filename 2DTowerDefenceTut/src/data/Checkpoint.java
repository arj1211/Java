package data;

public class Checkpoint {

	private Tile tile;
	private int xDirection, yDirection;
	
	
	
	public Checkpoint(Tile tile, int xDir, int yDir){
		this.tile=tile;
		this.xDirection=xDir;
		this.yDirection=yDir;
	}



	public Tile getTile() {
		return tile;
	}






	public int getxDirection() {
		return xDirection;
	}





	public int getyDirection() {
		return yDirection;
	}




	
	
	
	
	
	
	
}
