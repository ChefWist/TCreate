package tCreate.ui;

import tCreate.*;

public class UIElement extends ScreenObject {
	
	public static void setUp(UIElement uiE, int x, int y, int width, int height) {
		
		ScreenObject.setUp(uiE, x, y);
		uiE.width = width;
		uiE.height = height;
	}
}
