package tCreate;

import java.awt.*;
import java.awt.image.*;

public class ScreenObject {

	public BufferedImage image;
	public boolean mouse_hovering;
	public boolean mouse_dragging;
	public boolean draggable = false;
	public int x, y;
	public int width, height;
	public double scale = 1.0;
	
	public boolean checkPointCollision(int x, int y) {
		
		int myX = (int) (this.x-((scale-1) * (width/2)));
		int myY = (int) (this.y-((scale-1) * (height/2)));
		
		int myWidth = (int) (width * scale);
		int myHeight = (int) (height * scale);
		
		return x < myX + myWidth &&
			   x > myX &&
			   y < myY + myHeight &&
			   y > myY;
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
		
		if (checkPointCollision(x, y)) {
			
			clicked();
		}
	}
	public void clicked() {
		
	}
	
	public void update() {

	}

	public void draw(Graphics2D graphics) {

	}
	
	public void imageRender(Graphics2D g) {
		
		g.drawImage(image, getWorldX(), getWorldY(), width, height, null);
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
	
	public int getWorldScaledX() {
		return Camera.getWorldX(getScaledX());
	}
	public int getWorldScaledY() {
		return Camera.getWorldY(getScaledY());
	}
	public int getScaledX() {
		return (int) (this.x-((scale-1) * (width/2)));
	}
	public int getScaledY() {
		return (int) (this.y-((scale-1) * (height/2)));
	}
	public int getScaledWidth() {
		return (int) (width * scale);
	}
	public int getScaledHeight() {
		return (int) (height * scale);
	}
}
