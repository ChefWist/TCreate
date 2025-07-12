package tCreate.sprite;


public class PhysicsSprite extends Sprite {
	
	// DIRECTION VARIABLES
	public final static int DIRECTION_UP = 456;
	public final static int DIRECTION_DOWN = 23;
	public final static int DIRECTION_LEFT = 2;
	public final static int DIRECTION_RIGHT = 67;
	
	public double velocityX;
	public double velocityY;
	public double speed;
	public double resistence = 0.8; // Higher - Less Smooth
	
	public static void setUp(PhysicsSprite a, int x, int y, int width, int height, int speed) {
		
		Sprite.setUp(a, x, y, width, height);
		a.speed = speed;
	}
	
	public void addForceInDirection(int direction, int strength) {
		
		switch (direction) {
			case DIRECTION_UP -> velocityY -= speed*strength;
			case DIRECTION_DOWN -> velocityY += speed*strength;
			case DIRECTION_LEFT -> velocityX -= speed*strength;
			case DIRECTION_RIGHT -> velocityX += speed*strength;
		}
	}
	public void defaultMovement() {
		
		velocityX *= resistence;
		velocityY *= resistence;
		x += velocityX;
		y += velocityY;
	}
	public void update() {
		
		defaultMovement();
	}
}
