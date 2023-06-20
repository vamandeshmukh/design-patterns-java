package design.patterns.creational.factory.method;

/**
 * 
 * Factory method design pattern - Factory pattern is one of most used design
 * pattern in Java. This type of design pattern comes under creational pattern
 * as this pattern provides one of the best ways to create an object. In Factory
 * pattern, we create object without exposing the creation logic to the client
 * and refer to newly created object using a common interface.
 * 
 * Implementation - We're going to create a Shape interface and concrete classes
 * implementing the Shape interface. A factory class ShapeFactory is defined as
 * a next step. FactoryPatternDemo, our demo class will use ShapeFactory to get
 * a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to
 * ShapeFactory to get the type of object it needs.
 * 
 * 
 */

public class App {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.createShape("circle");
		shape1.draw();

		Shape shape2 = factory.createShape("square");
		shape2.draw();
	}

}
