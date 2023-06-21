package design.patterns.structural.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Green Circle: " + "radius: " + radius + " x: " + x + " y: " + y);

	}

}
