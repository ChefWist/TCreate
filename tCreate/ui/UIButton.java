package tCreate.ui;

import java.awt.*;

public class UIButton extends UIElement {
	
	
	public static void setUp(UIButton uiB, int x, int y, int width, int height) {
		
		UIElement.setUp(uiB, x, y, width, height);
	}
	
	public void defaultRender(Graphics2D graphics) {
		
		graphics.fillRect(x, y, width, height);
	}
	public void strokeRender(Graphics2D graphics, Color strokeColor, int strokeThicness) {
		
		Color old = graphics.getColor();
		graphics.setColor(strokeColor);
		graphics.fillRect(x - strokeThicness, y - strokeThicness, width + strokeThicness*2, height + strokeThicness*2);
		
		graphics.setColor(old);
		defaultRender(graphics);
	}
	public void textRender(Graphics2D graphics, String text, Color textColor, Font font) {
		
		defaultRender(graphics);
		
		UIText textElement = new UIText();
		UIText.setUp(textElement, text, getTextCenterX(text, font, width)+x, getTextCenterY(text, font, height)+y, font, textColor);
		textElement.draw(graphics);
	}
	public void textStrokeRender(Graphics2D graphics, Color strokeColor, int strokeThicness, String text, Color textColor, Font font) {
		
		Color old = graphics.getColor();
		graphics.setColor(strokeColor);
		graphics.fillRect(x - strokeThicness, y - strokeThicness, width + strokeThicness*2, height + strokeThicness*2);
		
		graphics.setColor(old);
		defaultRender(graphics);
		
		UIText textElement = new UIText();
		UIText.setUp(textElement, text, getTextCenterX(text, font, width)+x, getTextCenterY(text, font, height)+y, font, textColor);
		textElement.draw(graphics);
	}
	
	public int getTextCenterX(String text, Font font, int width) {
		return
				(width / 2)
				-((font.getSize()/4)*text.length())
		;
	}
	public int getTextCenterY(String text, Font font, int height) {
		return
				(height / 2)
				-(font.getSize()/2)
		;
	}
	
	public void draw(Graphics2D graphics) {
		
		defaultRender(graphics);
	}
}
