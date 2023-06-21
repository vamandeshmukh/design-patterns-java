package design.patterns.structural.bridge;

public class Circle extends Shape {

	protected Circle(int radius, int x, int y, DrawAPI drawApi) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;

	}

	private int radius, x, y;

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}

}
