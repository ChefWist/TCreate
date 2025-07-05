package tCreate.examples.homeScreen;

import java.util.*;

import tCreate.*;
import tCreate.scene.*;

public class HomeScreen extends UIScene {
	
	public void reset() {
		
		objects = new ArrayList<>(); // Emptys screen
		
		objects.add(new HSTitle()); // Creates a Title
		objects.add(new HSButtonPlay()); // Creates a Play Button
		
		Camera.positionTo(0, 0); // Sets camera to middle
	}
}
