package design.patterns.creational.abstractfactory;

/**
 * 
 * Abstract factory design pattern - Abstract Factory patterns works around a
 * super-factory which creates other factories. This factory is also called as
 * Factory of factories. This type of design pattern comes under creational
 * pattern as this pattern provides one of the best ways to create an object. In
 * Abstract Factory pattern an interface is responsible for creating a factory
 * of related objects, without explicitly specifying their classes. Each
 * generated factory can give the objects as per the Factory pattern.
 * 
 * Implementation - We're going to create a Shape and Color interfaces and
 * concrete classes implementing these interfaces. We creates an abstract
 * factory class AbstractFactory as next step. Factory classesShapeFactory and
 * ColorFactory are defined where each factory extends AbstractFactory. A
 * factory creator/generator class FactoryProducer is created.
 * AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a
 * AbstractFactory object. It will pass information (CIRCLE / RECTANGLE / SQUARE
 * for Shape) to AbstractFactory to get the type of object it needs. It also
 * passes information (RED / GREEN / BLUE for Color) to AbstractFactory to get
 * the type of object it needs.
 * 
 *
 */

public class App {

	public static void main(String[] args) {

		SuperFactory shapeFactory = FactoryProducer.getFactory("shape");

		Shape shape1 = shapeFactory.createShape("circle");

		shape1.draw();

		SuperFactory colorFactory = FactoryProducer.getFactory("color");

		Color color1 = colorFactory.fillColor("yellow");

		color1.fill();

	}

}
