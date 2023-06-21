package design.patterns.structural.bridge;

/**
 * Bridge Design Pattern - Bridge is used where we need to decouple an
 * abstraction from its implementation so that the two can vary independently.
 * This type of design pattern comes under structural pattern as this pattern
 * decouples implementation class and abstract class by providing a bridge
 * structure between them. This pattern involves an interface which acts as a
 * bridge which makes the functionality of concrete classes independent from
 * interface implementer classes. Both types of classes can be altered
 * structurally without affecting each other. We are demonstrating use of Bridge
 * pattern via following example in which a circle can be drawn in different
 * colors using same abstract class method but different bridge implementer
 * classes.
 * 
 * Implementation - We've an interface DrawAPI interface which is acting as a
 * bridge implementer and concrete classes RedCircle, GreenCircle implementing
 * the DrawAPI interface. Shape is an abstract class and will use object of
 * DrawAPI. BridgePatternDemo, our demo class will use Shape class to draw
 * different colored circle.
 * 
 * SoF:
 * https://stackoverflow.com/questions/1425171/difference-between-bridge-pattern-and-adapter-pattern
 * 
 */

public class App {

	public static void main(String[] args) {

		Shape redCircle = new Circle(50, 20, 10, new RedCircle());
		redCircle.draw();
		Shape greenCircle = new Circle(100, 10, 5, new GreenCircle());
		greenCircle.draw();

	}

}
