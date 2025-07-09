package tCreate.examples.hoverDragging;

import java.util.*;
import tCreate.*;
import tCreate.scene.*;

public class HoveringSceneTest extends UIScene {
	
	public void reset() {
		
		objects = new ArrayList<>();
		
		objects.add(new HoverButton());
		
		Camera.positionTo(0, 0);
	}
}