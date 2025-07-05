package tCreate.examples.homeScreen;

import java.awt.*;
import tCreate.*;
import tCreate.scene.*;
import tCreate.ui.*;

public class HSButtonPlay extends UIButton {
	
	public HSButtonPlay() {
		
		// UIButton, x, y, width, height
		UIButton.setUp(this, 
				(TCreate.getCurrentGame().getWidth()/2)-100,
				(TCreate.getCurrentGame().getHeight()/2)-50,
				200, 100);
	}
	
	public void draw(Graphics2D graphics) {
		
		// Draws a rectangle with outline and text inside
		/* Outline - Black
		 * Text - Black
		 * Background - White
		 * Text - Play
		 * Font - Normal sans-serif (60px size)
		 */
		graphics.setColor(Color.white); // BG Color
		this.textStrokeRender(graphics,
				Color.black, 10, // Stroke Settings (Outline)
				"Play", Color.black, new Font("SansSerif", Font.PLAIN, 60) // Text Settings
		); 
	}
	
	public void clicked() {
		
		// Changes Scene when clicked
		TCreate.changeSceneTo(new Scene());
	}
}
