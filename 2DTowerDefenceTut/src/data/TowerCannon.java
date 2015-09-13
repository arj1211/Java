package data;

import static helpers.Artist.*;
import static helpers.Clock.*;

import java.util.ArrayList;

import org.newdawn.slick.opengl.Texture;

public class TowerCannon {

	private float x,y,timeSinceLastShot,firingSpeed,angle;
	private int width, height, damage;
	private Texture baseTexture,cannonTexture;
	private Tile startTile;
	private ArrayList<Projectile> projectiles;
	private ArrayList<Enemy> enemies;
	private Enemy target;
	
	
	public TowerCannon(Texture baseTex, Tile startTile, int damage, ArrayList<Enemy> enemies){
		this.baseTexture=baseTex;
		this.cannonTexture=quickLoadTex("cannonGun");
		this.startTile=startTile;
		this.x=startTile.getX();
		this.y=startTile.getY();
		this.damage=damage;
		this.width=(int) startTile.getWidth();
		this.height=(int) startTile.getHeight();
		this.firingSpeed=3;
		this.timeSinceLastShot=0;
		this.projectiles=new ArrayList<Projectile>();
		this.enemies=enemies;
		this.target=aquireTarget();
		this.angle=calculateAngle();
	}
	
	
	private Enemy aquireTarget(){
		return enemies.get(0);
	}
	
	private float calculateAngle(){
		//atan is arctan, which is tan^-1, not 1/tan
		double angleTemp = Math.atan2(target.getY()-y, target.getX()-x);
		return (float) Math.toDegrees(angleTemp) -90;
	}
	
	private void shoot(){
		timeSinceLastShot=0;
		projectiles.add(new Projectile(quickLoadTex("bullet"),target, x+GameManager.TILE_SIZE/2-GameManager.TILE_SIZE/4, y+GameManager.TILE_SIZE/2-GameManager.TILE_SIZE/4, 900, 10));
	}
	
	public void update(){
		timeSinceLastShot+=delta();
		if (timeSinceLastShot>firingSpeed)
			shoot();
		
		
		for (Projectile p: projectiles)
			p.update();
		angle=calculateAngle();
		draw();
	}
	
	
	public void draw() {
		drawQuadTex(baseTexture, x, y, width, height);
		drawQuadTexRot(cannonTexture, x, y, width, height,angle);
	}
	
}
