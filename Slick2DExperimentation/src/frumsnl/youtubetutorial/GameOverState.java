package frumsnl.youtubetutorial;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameOverState extends BasicGameState {

	public GameOverState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		g.drawString("Game Over", 295, 195);
		g.drawString("Final Score: " + GameState.getScore(), 295, 210);
		g.drawString("Click ENTER/RETURN to replay", 295, 230);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		if (container.getInput().isKeyPressed(Keyboard.KEY_RETURN)) {
			
			game.enterState(0, SetupClass.fOut, SetupClass.fIn);
			GameState.restart();
			
		}
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

}
