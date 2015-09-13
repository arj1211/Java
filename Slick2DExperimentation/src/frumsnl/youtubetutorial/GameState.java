package frumsnl.youtubetutorial;

import java.util.ArrayList;
import java.util.Random;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class GameState extends BasicGameState {

	private static ArrayList<Circle> balls;
	private static Circle mouseBall;
	private static int timePassed;
	private static Random rand;
	private static int score;
	private static int lives;
	private static int timeTho;
	private static int wave;
	private static int toTheDelay;

	public GameState() {

	}

	public static void restart() {
		balls = new ArrayList<Circle>();
		mouseBall = new Circle(80, 80, 20);
		timePassed = 0;
		rand = new Random();
		score = 0;
		lives = 5;
		timeTho = 700;
		wave = 1;
		toTheDelay = 230;
	}

	public static int getScore() {
		return score;
	}

	public static void setScore(int scoreSet) {
		score = scoreSet;
	}

	public static int getLives() {
		return lives;
	}

	public static void setLives(int livesSet) {
		lives = livesSet;

	}

	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub
		balls = new ArrayList<Circle>();
		mouseBall = new Circle(80, 80, 20);
		timePassed = 0;
		rand = new Random();
		score = 0;
		lives = 5;
		timeTho = 600;
		wave = 1;
		toTheDelay = 230;
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

		g.setColor(Color.cyan);
		g.fill(mouseBall);
		g.setColor(Color.red);
		for (Circle c : balls)
			g.fill(c);
		g.setColor(Color.lightGray);
		g.drawString("ESC to pause", 55, 50);
		g.setColor(Color.magenta);
		g.drawString("Current Balls: " + balls.size(), 55, 50 + 15);
		g.drawString("Current Score: " + score, 55, 50 + 30);
		g.drawString("Current Lives: " + lives, 55, 50 + 45);
		g.setColor(Color.orange);
		g.drawString("Millisecond Delay: " + timeTho+", target to wave: "+toTheDelay, 55, 50 + 60);
		g.drawString("Wave: " + wave, 55, 50 + 75);

	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

		if (container.getInput().isKeyPressed(Keyboard.KEY_ESCAPE))
			game.enterState(3, new FadeOutTransition(), new FadeInTransition());
		mouseBall.setCenterX(container.getInput().getMouseX());
		mouseBall.setCenterY(container.getInput().getMouseY());

		timePassed += delta;
		if (timePassed > timeTho) {
			timePassed = 0;
			balls.add(new Circle(20 + rand.nextInt(380), 0, 10));
		}

		for (Circle c : balls)
			c.setCenterY(c.getCenterY() + delta / 5f);
		for (int i = balls.size() - 1; i >= 0; i--) {
			Circle c = balls.get(i);
			if (c.getCenterY() > 399) {
				lives--;
				balls.remove(i);
				score -= 30;
			} else if (c.intersects(mouseBall)) {
				balls.remove(i);
				score += 20;
				timeTho -= 2;
			}
		}
		
		if (timeTho <= toTheDelay) {
			toTheDelay-= 15;
			
			
			timeTho = 600;
			
			if (lives<=2)
			lives += 2;
			wave++;
			
		}

		if (lives <= 0)
			game.enterState(1, SetupClass.fOut, SetupClass.fIn);

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
