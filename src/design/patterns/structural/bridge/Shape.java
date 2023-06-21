package design.patterns.structural.bridge;

public abstract class Shape {

	DrawAPI drawApi;

	protected Shape(DrawAPI drawApi) {
		this.drawApi = drawApi;
	}

	public abstract void draw();

}
