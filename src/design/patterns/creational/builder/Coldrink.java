package design.patterns.creational.builder;

public abstract class Coldrink implements Item {

	@Override
	public Packing packing() {

		return new Bottle();
	}

}
