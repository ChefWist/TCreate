package tCreate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import tCreate.scene.Scene;

@SuppressWarnings("serial")
public class ScreenPanel extends JPanel implements Runnable {

	public Scene currentScene;
	Thread gameThread;

	public ScreenPanel(int width, int height) {

		setPreferredSize(new Dimension(width, height));
		setBackground(Color.white);
		setDoubleBuffered(true);
		setFocusable(true);
	}

	// GAME LOOP
	public void startGameLoop() {

		gameThread = new Thread(this);
		gameThread.start();
	}

	public void run() {

		double drawInterval = 1000000000 / 60;
		double nextDrawTime = System.nanoTime() + drawInterval;
		double delta = 0;
		double currentTime;

		while (gameThread != null) {

			currentTime = System.nanoTime();
			delta += (currentTime - nextDrawTime) / drawInterval;

			if (delta > 1) {

				update();
				repaint();
				delta--;
				nextDrawTime += drawInterval;
			}
		}
	}

	public void update() {
		if (currentScene != null)
			currentScene.update();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D graphics = (Graphics2D) g;

		if (currentScene != null)
			currentScene.draw(graphics);

		graphics.dispose();
	}

}
