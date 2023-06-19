package design.patterns.creational.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "veg Burger";
	}

	@Override
	public double price() {
		return 100.00;
	}

}
