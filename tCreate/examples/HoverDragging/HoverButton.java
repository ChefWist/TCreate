package tCreate.examples.HoverDragging;

import java.awt.*;
import tCreate.ui.*;

public class HoverButton extends UIButton {
	
	Color color;
	
	public HoverButton() {
		
		draggable = true;
		UIButton.setUp(this, 100, 100, 50, 50);
	}
	
	public void update() {
		
		if (mouse_hovering) {
			color = Color.gray;
		}
		else {
			color = Color.black;
		}
	}
	
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(color);
		
		defaultRender(graphics);
	}
}
