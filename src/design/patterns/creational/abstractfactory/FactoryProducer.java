package design.patterns.creational.abstractfactory;

public class FactoryProducer {

	public static SuperFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
