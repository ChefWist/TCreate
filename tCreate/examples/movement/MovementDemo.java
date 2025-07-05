package tCreate.examples.movement;

import tCreate.*;

public class MovementDemo {
	
	public static void launch() {
		
		// Creates TCreate(Title, width, height)
		new TCreate("Movement Demo", 500, 500);
		
		// Changes scene e.g. menu scene, game scene, pause scene
		TCreate.changeSceneTo(new GameScene());
		
		// Starts game loop
		TCreate.startGame();
	}
}
