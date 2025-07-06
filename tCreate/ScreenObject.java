package tCreate;

import java.awt.Graphics2D;

public class ScreenObject {

	public boolean mouse_hovering;
	public boolean mouse_dragging;
	public boolean draggable = false;
	public int x, y;
	public int width, height;
	
	public boolean checkPointCollision(int x, int y) {
		
		return x < this.x + this.width &&
			   x > this.x &&
			   y < this.y + this.height &&
			   y > this.y;
	}
	public void checkMouseHovering(int x, int y) {
		mouse_hovering = checkPointCollision(x, y);
	}
	public void checkMouseDragging(int x, int y) {
		mouse_dragging = checkPointCollision(x, y);
		if (mouse_dragging) drag(x, y);
	}
	
	public void drag(int x, int y) {
		if (!draggable) return;
		
		int centerX = (x - width/2);
		int centerY = (y - height/2);
		
		this.x = centerX;
		this.y = centerY;
	}
	
	public void checkClicked(int x, int y) {
		
		if (x < this.getWorldX() + this.width &&
			x > this.getWorldX() &&
			y < this.getWorldY() + this.height &&
			y > this.getWorldY()) {
			
			clicked();
		}
	}
	public void clicked() {
		
	}
	
	public void update() {

	}

	public void draw(Graphics2D graphics) {

	}

	public static void setUp(ScreenObject a, int x, int y) {
		a.x = x;
		a.y = y;
	}

	public int getWorldX() {
		return Camera.getWorldX(x);
	}

	public int getWorldY() {
		return Camera.getWorldY(y);
	}
}
