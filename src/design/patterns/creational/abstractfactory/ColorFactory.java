package design.patterns.creational.abstractfactory;

public class ColorFactory extends SuperFactory {

	@Override
	public Color fillColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("yellow")) {
			return new Yellow();
		} else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		}
		return null;
	}

//	@Override
//	Shape createShape(String typeOfShape) {
//		return null;
//	}

}
