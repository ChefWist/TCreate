package tCreate.sprite;

import tCreate.*;

public class Sprite extends ScreenObject {
	
	public int width, height;
	
	public static void setUp(Sprite a, int x, int y, int width, int height) {
		
		ScreenObject.setUp(a, x, y);
		a.width = width;
		a.height = height;
	}
}
