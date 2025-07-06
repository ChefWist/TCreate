package tCreate.assetManager;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageHandler {
	
	public BufferedImage getImage(String filePath) {
		
		BufferedImage image;
		try {
			image = ImageIO.read(getClass().getResourceAsStream(filePath));
			return image;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
