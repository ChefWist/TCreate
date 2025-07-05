package tCreate.scene;

import java.awt.event.*;
import tCreate.*;
import tCreate.ui.*;

public class UIScene extends Scene implements MouseListener {
	
	public UIScene() {
		
		mouseListener = this;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		for (ScreenObject obj : objects) {
			UIElement obj2 = (UIElement) obj;
			
			obj2.checkClicked(e.getX(), e.getY());
		}
		
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
