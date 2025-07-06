package tCreate.assetManager;

import java.awt.image.*;

public class AssetManager {
	
	public static ImageHandler imageH = new ImageHandler();
	
	public static BufferedImage getImageFromPath(String filePath) {
		
		return imageH.getImage(filePath);
	}
}
