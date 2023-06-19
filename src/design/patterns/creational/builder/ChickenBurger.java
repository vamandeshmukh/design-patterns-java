package design.patterns.creational.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public double price() {
		return 150.00;
	}

}
