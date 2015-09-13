package data;

public enum TileType {

	//different types of tiles, and whether u can build a tower on them or nah
	Grass("grass",true),
	Dirt("dirt",false),
	Water("water",false),
	NULL("water",false);
	
	
	String texName;
	boolean buildTowerOn;
	
	
	TileType(String texName, boolean buildTowerOn){
		this.texName = texName;
		this.buildTowerOn = buildTowerOn;
	}
	
	
}
