package tCreate.examples.movement;

import tCreate.*;
import tCreate.sprite.*;

import java.awt.*;

public class Player extends PhysicsSprite {
	
	public boolean upPressed, downPressed, rightPressed, leftPressed;
	
	public Player() {
		
		PhysicsSprite.setUp(this, 0, 0, 50, 50, 3);
	}
	
	public void update() {
		
		// Cool movement
		if (leftPressed) addForceInDirection(DIRECTION_LEFT, 1);
		if (rightPressed) addForceInDirection(DIRECTION_RIGHT, 1);
		if (upPressed) addForceInDirection(DIRECTION_UP, 1);
		if (downPressed) addForceInDirection(DIRECTION_DOWN, 1);
		
		defaultMovement();
		
		// Glides camera to player at centre of screen (- 225)
		Camera.moveTo(x - 225, y - 225);
	}
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(Color.blue);
		graphics.fillRect(getWorldX(), getWorldY(), width, height);
	}
}
