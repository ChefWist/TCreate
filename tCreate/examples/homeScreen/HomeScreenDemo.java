package tCreate.examples.homeScreen;

import tCreate.*;

public class HomeScreenDemo {
	
	public static void launch() {
		
		// TCreate
		
		new TCreate("Home Screen", 500, 500); // Title, width, height
		
		TCreate.changeSceneTo(new HomeScreen()); // Changes Scene
		
		TCreate.startGame(); // Starts Game
	}
}
