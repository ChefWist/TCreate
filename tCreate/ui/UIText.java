package tCreate.ui;

import java.awt.*;

public class UIText extends UIElement {
	
	public String text;
	public Font font;
	public Color color;
	
	public static void setUp(UIText uiT, String text, int x, int y, Font font, Color color) {
		
		UIElement.setUp(uiT, x, y, 0, 0);
		uiT.font = font;
		uiT.color = color;
		uiT.text = text;
	}
	
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(color);
		graphics.setFont(font);
		graphics.drawString(text, getWorldX(), getWorldY() + font.getSize());
	}
	
	public void checkClicked(int x, int y) {
		
		width = text.length() * (font.getSize()/2);
		height = font.getSize();
		
		if (x < this.getWorldX() + this.width &&
			x > this.getWorldX() &&
			y < this.getWorldY() + this.height &&
			y > this.getWorldY()) {
			
			clicked();
		}
	}
}
