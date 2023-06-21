package design.patterns.behavioural.visitor;

/**
 * 
 * In Visitor pattern, we use a visitor class which changes the executing
 * algorithm of an element class. By this way, execution algorithm of element
 * can varies as visitor varies. This pattern comes under behavior pattern
 * category. As per the pattern, element object has to accept the visitor object
 * so that visitor object handles the operation on the element object.
 * 
 * Implementation - We're going to create a ComputerPart interface defining
 * accept opearation. Keyboard, Mouse, Monitor and Computer are concrete classes
 * implementing ComputerPart interface. We'll define another interface
 * ComputerPartVisitor which will define visitor class operations. Computer uses
 * concrete visitor to do corresponding action. VisitorPatternDemo, our demo
 * class will use Computer, ComputerPartVisitor classes to demonstrate use of
 * visitor pattern.
 *
 */

public class App {

}
