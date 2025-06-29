package tCreate;

public abstract class Camera {
	
	private static int x, y;
	private static int targetX, targetY;
	
	public static boolean smoothed = true;
	public static int smoothing_speed = 3;
	
	public static void positionTo(int x, int y) {
		
		Camera.x = x;
		Camera.y = y;
	}
	public static void moveTo(int x, int y) {
		
		targetX = x;
		targetY = y;
	}
	public static void update() {
		
		if (!smoothed) {
			x = targetX;
			y = targetY;
			return;
		}
		x += (targetX - x) / smoothing_speed;
		y += (targetY - y) / smoothing_speed;
	}
	
	public static int getX() { return x; }
	public static int getY() { return y; }
	public static int getWorldX(int x) { return x - Camera.x; }
	public static int getWorldY(int y) { return y - Camera.y; }
}
