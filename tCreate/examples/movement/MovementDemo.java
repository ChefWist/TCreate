package tCreate.examples.movement;

import tCreate.*;

public class MovementDemo {
	
	public static void launch() {
		
		// Creates TCreate(Title, width, height)
		TCreate game = new TCreate("Movement Demo", 500, 500);
		
		// Changes scene e.g. menu scene, game scene, pause scene
		game.changeSceneTo(new GameScene());
		
		// Starts game loop
		game.startGame();
	}
}
