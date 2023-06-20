package design.patterns.creational.abstractfactory;

public class ShapeFactory {

	// this method can also be static 
	public Shape createShape(String typeOfShape) {
		if (typeOfShape.equalsIgnoreCase("square"))
			return new Square();
		else if (typeOfShape.equalsIgnoreCase("circle"))
			return new Circle();
		else if (typeOfShape.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		// code 
		return null;

	}

}
