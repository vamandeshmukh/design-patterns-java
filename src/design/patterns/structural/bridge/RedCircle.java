package design.patterns.structural.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Red Circle: " + "radius: " + radius + " x: " + x + " y: " + y);

	}

}
