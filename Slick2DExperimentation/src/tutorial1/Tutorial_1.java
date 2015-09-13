/**
 * @author Arjun
 */
package tutorial1;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tutorial_1 extends BasicGame {

	//~~~~variables~~~~~~~~~
	Image arrow;
	Image triangle;
	float xmovy=50f;
	//~~~~~~~~~~~~~~~~~~~~~~
	public Tutorial_1(String title) {
		super(title);
	}

	@Override
	/*
	 * render is called constantly. 
	 * This is where all your graphics is done.
	 */
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.setColor(Color.red); 
		// Preset Color Red
		g.drawString("Hello World!", 200, 50);
		
		g.setColor(new Color(0,255,150)); 
		// A  yucky green defined using three integers
		g.drawString("Hello World!", 200, 100);
		
		g.setColor(new Color(1.0f,0.5f,0.5f,0.8f)); 
		// A light purple with 80% transparency defined using four floats
		g.drawString("Hello World!", 200, 150);
		
		g.setColor(new Color(0x7b2900)); 
		// A brown-reddish defined using hex
		g.drawString("Hello World!", 200, 200);
		
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
		/*
		 * If you want to smooth the jagged edges, 
		 * put g.setAntiAlias(true); before everything. 
		 * You can also apply anti-aliasing to specific 
		 * things, by turning it on and off before 
		 * drawing things. For instance, if we wanted 
		 * the red cross smoothed but leave the circle 
		 * we would turn on anti-aliasing before drawing 
		 * the lines and then turn it off before filling 
		 * the circle.
		 */
		
		g.setColor(new Color(0xff00ff)); 
		// Luminous pink!
		g.drawString("Hello World!",200,250);
		 
		g.setColor(Color.blue);
		g.drawRect(180, 170+50, 150, 80);
		 
		g.setAntiAlias(true);
		g.setColor(Color.red);
		g.drawLine(250, 190+50, 300, 230+50);
		g.drawLine(250, 230+50, 300, 190+50);
		
		g.setAntiAlias(false);
		g.setColor(new Color(0f,0.6f,0.8f,0.5f)); 
		// transparent bluish, 50% transparent
		g.fillOval(190, 180+50, 60, 60);
		
		
		
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
		
		// draws the images at the specified positions
			//g.drawImage(arrow,50,100); //this is the original line
		g.drawImage(arrow,xmovy,100); //my own
		g.drawImage(triangle,100,200);
		 
		// draws the image, but with green
		g.drawImage(arrow, 150, 100, Color.green);
		 
		// To draw the image transparent
		// use white as the colour and set the alpha
		// the following draws the image at 50% transparency
		g.drawImage(arrow, 250, 100, new Color(1f,1f,1f,0.5f));
		 
		// draws a part of the image
		// a 50x60 snippet at 20,10 on the image
		// drawn at 300,200 on the screen
		g.drawImage(triangle,
		    300, 200, // where you want the top-left of the snippet to be
		    350, 260, // bottom-right "
		    20, 10, // top-left of the snippet relative to the image
		    70, 70); // bottom-right "
		 
		// draws the image at twice the size
		g.drawImage(arrow,
		    50, 350,
		    50+arrow.getWidth()*2,
		    350+arrow.getHeight()*2,
		    0, 0,
		    arrow.getWidth(),
		    arrow.getHeight());
		
		
	}

	@Override
	/*
	 * init is called when the game starts. 
	 * You can put code here to set things 
	 * up for your game, such as loading 
	 * resources like images and sounds.
	 */
	public void init(GameContainer container) throws SlickException {
		arrow = new Image("lib/res/Tutorial_1/arrow.png");
	    triangle = new Image("lib/res/Tutorial_1/triangle.png");
	}

	@Override
	/*
	 * update is called periodically, 
	 * usually every 20 milliseconds, 
	 * but the time will vary depending 
	 * on how much processing you’ll be 
	 * putting in. This is where the 
	 * game logic is done.
	 */
	public void update(GameContainer container, int delta)
			throws SlickException {

		//my own
		xmovy+=0.1;
		
	}

	/*
	 * Then there is main. Everything starts here. 
	 * Let’s put in the first few lines of code 
	 * to get things going.
	 *
	 * Every game needs to be put into a GameContainer 
	 * to be viewed. We are using AppGameContainer, 
	 * which puts our game into a window.
	 */
	
	public static void main(String[] args) {
		
		Tutorial_1 game = new Tutorial_1("Tutorial_1");
		try {
			AppGameContainer container = new AppGameContainer(game);
			container.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
