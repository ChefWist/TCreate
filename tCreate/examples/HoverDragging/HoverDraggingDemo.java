package tCreate.examples.HoverDragging;

import tCreate.*;

public class HoverDraggingDemo {
	
	public static void launch() {
		
		new TCreate("UI Scene", 600, 500);
		TCreate.changeSceneTo(new HoveringSceneTest());
		TCreate.startGame();
	}
}
