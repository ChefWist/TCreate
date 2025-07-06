package tCreate;

import java.awt.event.*;
import javax.swing.*;
import tCreate.scene.*;

public class TCreate {
	
	private final static double current_version = 0.3;
	private final static String developer = "ChefwistDev";
	public static void displayInfomation() {
		System.out.printf("****************************\nTCreate V%.1f\nDeveloped by %s\n****************************\n", current_version, developer);
	}

	public JFrame window;
	public static ScreenPanel screenPanel;

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
	
	public static ScreenPanel getCurrentGame() {
		
		return screenPanel;
	}
	public static Scene getCurrentScene() {
		
		return screenPanel.currentScene;
	}

	public static void startGame() {
		screenPanel.startGameLoop();
	}

	// SCENES
	public static void changeSceneTo(Scene scene) {
		
		if (scene == null) return;

		for (KeyListener listener : screenPanel.getKeyListeners()) {
			screenPanel.removeKeyListener(listener);
		}
		if (scene.keyListener != null)
			screenPanel.addKeyListener(scene.keyListener);

		for (MouseListener listener : screenPanel.getMouseListeners()) {
			screenPanel.removeMouseListener(listener);
		}
		if (scene.mouseListener != null)
			screenPanel.addMouseListener(scene.mouseListener);

		for (MouseMotionListener listener : screenPanel.getMouseMotionListeners()) {
			screenPanel.removeMouseMotionListener(listener);
		}
		if (scene.mouseMotionListener != null)
			screenPanel.addMouseMotionListener(scene.mouseMotionListener);

		screenPanel.currentScene = scene;
	}
}
