package tCreate;

import java.awt.*;

public class ScreenObject {
	
	public int x, y;
	
	public void update() {
		
	}
	public void draw(Graphics2D graphics) {
		
	}
	
	public static void setUp(ScreenObject a, int x, int y) {
		a.x = x;
		a.y = y;
	}
	
	public int getWorldX() { return Camera.getWorldX(x); }
	public int getWorldY() { return Camera.getWorldY(y); }
}
