package design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void showItems() {
		items.forEach((i) -> {
			System.out.println(i.name());
			System.out.println(i.packing().pack());
			System.out.println(i.price());
		});
	}

	public double getCost() {
		double cost = 0.0;
//		items.forEach(i -> cost += i.price());
		for (Item i : items)
			cost += i.price();
		return cost;
	}

}
