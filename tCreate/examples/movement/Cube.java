package tCreate.examples.movement;

import java.awt.*;

import tCreate.sprite.*;

public class Cube extends Sprite {
	
	public Cube() {
		
		// Initailise sprite (sprite, x, y, width, height)
		Sprite.setUp(this, 200, 200, 50, 50);
	}
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(Color.green);
		graphics.fillRect(getWorldX(), getWorldY(), width, height);
	}
}
