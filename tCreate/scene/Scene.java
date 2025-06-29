package tCreate.scene;

import tCreate.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Scene {
	
	public KeyListener keyListener;
	public MouseListener mouseListener;
	public MouseMotionListener mouseMotionListener;
	public ArrayList<ScreenObject> objects;
	
	public Scene() {
		
		reset();
	}
	
	public void update() {
		
		Camera.update();
		for (ScreenObject object : objects) {
			object.update();
		}
	}
	public void draw(Graphics2D graphics) {
		
		for (ScreenObject object : objects) {
			object.draw(graphics);
		}
	}
	public void reset() {
		
		objects = new ArrayList<>();
		Camera.positionTo(0, 0);
	}
}
