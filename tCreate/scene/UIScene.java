package tCreate.scene;

import java.awt.event.*;
import tCreate.*;
import tCreate.ui.*;

public class UIScene extends Scene implements MouseListener, MouseMotionListener {
	
	public UIScene() {
		
		mouseListener = this;
		mouseMotionListener = this;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		for (ScreenObject obj : objects) {
			
			obj.checkClicked(e.getX(), e.getY());
		}
		
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		for (ScreenObject obj : objects) {
			
			obj.checkMouseDragging(e.getX(), e.getY());
		}
	}
	public void mouseMoved(MouseEvent e) {
		
		for (ScreenObject obj : objects) {
			
			obj.checkMouseHovering(e.getX(), e.getY());
		}
	}
}
