package frumsnl.youtubetutorial;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class SetupClass extends StateBasedGame {

	private Image spSh, grass, stoneBrick,pumpblk,pumpyel;
	private SpriteSheet sheet;
	
	private Shape circle;
	private Shape circle2;

	
	public static FadeInTransition fIn;
	public static FadeOutTransition fOut;
	
	
	
	
	public SetupClass(String title) {
		super(title);
		
	}
/*
	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {

		for (int y = 0; y < 8; y++) 
			grass.draw(32 * 5 + y * 32, 32 * 6);
		for (int y = 0; y < 19; y++){
			stoneBrick.draw(y * 32, 400 - 32);
			pumpblk.draw(y*64, 0);
			pumpyel.draw(y*64+32, 0);
		}
		
		sheet.getSprite(5, 4).draw(80,80);
		g.setColor(Color.blue);
		g.fill(circle);
		g.setColor(Color.cyan);
		g.draw(circle);
		
	}

	@Override
	public void init(GameContainer container) throws SlickException {

		
		spSh = new Image("lib/res/FrumsNL/terrain.png");
		grass = spSh.getSubImage(3 * 32, 0, 32, 32);
		stoneBrick = spSh.getSubImage(0, 32, 32, 32);
		pumpblk = spSh.getSubImage(7*32, 7*32, 32, 32);
		pumpyel = spSh.getSubImage(8*32, 7*32, 32, 32);
		
		sheet= new SpriteSheet(spSh, 32, 32);

		circle = new Circle(50,400-70,15);
		
		
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {

		circle.setCenterX(container.getInput().getMouseX());
		
	}
*/
	public static void main(String[] args) throws SlickException {

		AppGameContainer appgc = new AppGameContainer(new SetupClass(
				"SetupClass"));
		appgc.setDisplayMode(600, 400, false);
		
		appgc.start();
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new GameState());
		this.addState(new GameOverState());
		this.addState(new PauseState());
		fIn = new FadeInTransition();
		fOut = new FadeOutTransition();
		
	}

}
