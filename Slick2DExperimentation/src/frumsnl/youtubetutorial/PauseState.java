package frumsnl.youtubetutorial;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class PauseState extends BasicGameState {

	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		
		g.drawString("Paused, ESC to resume", 295,195 );

	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		if(container.getInput().isKeyPressed(Keyboard.KEY_ESCAPE))
			game.enterState(0, SetupClass.fOut, SetupClass.fIn);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 3;
	}

}
