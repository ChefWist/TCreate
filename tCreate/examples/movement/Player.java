package tCreate.examples.movement;

import tCreate.*;
import tCreate.sprite.*;

import java.awt.*;

public class Player extends Sprite {
	
	public boolean upPressed, downPressed, rightPressed, leftPressed;
	
	public double speed = 3;
	public double velX = 0;
	public double velY = 0;
	
	public Player() {
		
		Sprite.setUp(this, 0, 0, 50, 50);
	}
	
	public void update() {
		
		// Cool movement
		if (leftPressed) velX -= speed;
		if (rightPressed) velX += speed;
		if (upPressed) velY -= speed;
		if (downPressed) velY += speed;
		
		velX *= 0.8;
		velY *= 0.8;
		x+=velX;
		y+=velY;
		
		// Glides camera to player at centre of screen (- 225)
		Camera.moveTo(x - 225, y - 225);
	}
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(Color.blue);
		graphics.fillRect(getWorldX(), getWorldY(), width, height);
	}
}
