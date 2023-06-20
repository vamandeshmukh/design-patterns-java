package design.patterns.creational.abstractfactory;

public abstract class SuperFactory {

	abstract Color fillColor(String color);

	abstract Shape createShape(String typeOfShape);
}