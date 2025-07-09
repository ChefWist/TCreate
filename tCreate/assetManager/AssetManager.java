package tCreate.assetManager;

import java.awt.image.*;
import java.util.*;

public class AssetManager {
	
	public ImageHandler imageH = new ImageHandler();
	public ArrayList<SoundAsset> soundAssets = new ArrayList<>();
	
	// IMAGE CONTROLS
	public BufferedImage getImageFromPath(String filePath) {
		
		return imageH.getImage(filePath);
	}
	
	// MUSIC CONTROLS
	public int loadSound(String relFilePath) {
		
		soundAssets.add(new SoundAsset(relFilePath));
		return soundAssets.size()-1;
	}
	public void playSound(int idx) {
		
		soundAssets.get(idx).playSfx();
	}
	public void playLoopedSound(int idx) {
		
		soundAssets.get(idx).playMusic();
	}
	public void stopSound(int idx) {
		
		soundAssets.get(idx).stopSound();
	}	
}
