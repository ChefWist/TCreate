package tCreate.examples.homeScreen;

import java.awt.*;

import tCreate.*;
import tCreate.ui.*;

public class HSTitle extends UIText {
	
	public HSTitle() {
		
		// UIText, text, x, y, font, color
		UIText.setUp(this,
				"Home Screen",
				0,
				60,
				new Font("SansSerif", Font.BOLD, 60), // Bold sans-serif font (60px size)
				Color.black
		);
	}
	
	public void update() {
		
		// Center X
		x = 
			(TCreate.getCurrentGame().getWidth() / 2)
			-((font.getSize()/4)*text.length())
		;
	}
}
