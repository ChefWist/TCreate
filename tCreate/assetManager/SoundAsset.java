package tCreate.assetManager;

import java.net.*;
import javax.sound.sampled.*;

public class SoundAsset {
	
	public URL url;
	public AudioInputStream ais;
	public Clip clip;
	
	public SoundAsset(String relativeFilePath) {
		
		url = getClass().getResource(relativeFilePath);
		
		try {
			
			clip = AudioSystem.getClip();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		openClip();
	}
	
	private void openClip() {
		
		try {
			
			ais = AudioSystem.getAudioInputStream(url);
			clip.open(ais);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void playSfx() {
		
		clip.start();
	}
	public void playMusic() {
		
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void stopSound() {
		
		clip.stop();
	}
}
