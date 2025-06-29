package tCreate.examples.movement;

import java.awt.event.*;
import java.util.*;
import tCreate.*;
import tCreate.scene.*;

public class GameScene extends Scene implements KeyListener {
	
	// Sprites
	public Player player;
	public Cube cube;
	
	public void reset() {
		
		objects = new ArrayList<>();
		
		// Makes on-screen elements appear
		cube = new Cube();
		objects.add(cube);
		
		player = new Player();
		objects.add(player);
		
		// Places camera at center of screen
		Camera.moveTo(player.x - 225, player.y - 225); // Makes moving smooth
		Camera.positionTo(player.x - 225, player.y - 225); // Makes moving INSTANT
		
		keyListener = this;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switchKey(e, true);
	}
	public void keyReleased(KeyEvent e) {
		switchKey(e, false);
	}
	public void keyTyped(KeyEvent e) {}
	
	public void switchKey(KeyEvent e, boolean value) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_W -> player.upPressed = value;
			case KeyEvent.VK_A -> player.leftPressed = value;
			case KeyEvent.VK_S -> player.downPressed = value;
			case KeyEvent.VK_D -> player.rightPressed = value;
		}
	}
}
