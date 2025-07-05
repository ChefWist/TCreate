package tCreate.ui;

import tCreate.*;

public class UIElement extends ScreenObject {
	
	public int width, height;
	
	public static void setUp(UIElement uiE, int x, int y, int width, int height) {
		
		ScreenObject.setUp(uiE, x, y);
		uiE.width = width;
		uiE.height = height;
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
}
