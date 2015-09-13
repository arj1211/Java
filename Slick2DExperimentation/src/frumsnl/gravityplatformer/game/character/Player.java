package frumsnl.gravityplatformer.game.character;

import frumsnl.gravityplatformer.game.physics.AABoundingRect;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player extends Character {

    public Player(float x, float y) throws SlickException{
        super(x,y);
        setSprite(new Image("lib/res/FrumsNL/player.png"));
        
        setMovingAnimation(new Image[]{new Image("lib/res/FrumsNL/player_1.png"),new Image("lib/res/FrumsNL/player_2.png"),
                                       new Image("lib/res/FrumsNL/player_3.png"),new Image("lib/res/FrumsNL/player_4.png")}
                                       ,125);
        boundingShape = new AABoundingRect(x+3, y, 26, 32);
        
        accelerationSpeed = 0.001f;
        maximumSpeed = 0.15f;
        maximumFallSpeed = 0.3f;
        decelerationSpeed = 0.001f;
    }
    
    public void updateBoundingShape(){
        boundingShape.updatePosition(x+3,y);
    }

}
