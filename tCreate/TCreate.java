package tCreate;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

import tCreate.scene.Scene;

public class TCreate {
	
	public JFrame window;
	public ScreenPanel screenPanel;
	
	public TCreate(String title, int width, int height) {
		
		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		screenPanel = new ScreenPanel(width, height);
		window.add(screenPanel);
		
		window.pack();
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
		screenPanel.requestFocus();
	}
	
	public void startGame() {
		screenPanel.startGameLoop();
	}
	
	// SCENES
	public void changeSceneTo(Scene scene) {
		
		for (KeyListener listener : screenPanel.getKeyListeners()) {
			screenPanel.removeKeyListener(listener);
		}
		if (scene.keyListener != null) screenPanel.addKeyListener(scene.keyListener);
		
		for (MouseListener listener : screenPanel.getMouseListeners()) {
			screenPanel.removeMouseListener(listener);
		}
		if (scene.mouseListener != null) screenPanel.addMouseListener(scene.mouseListener);
		
		for (MouseMotionListener listener : screenPanel.getMouseMotionListeners()) {
			screenPanel.removeMouseMotionListener(listener);
		}
		if (scene.mouseMotionListener != null) screenPanel.addMouseMotionListener(scene.mouseMotionListener);
		
		screenPanel.currentScene = scene;
	}
}
