package design.patterns.creational.builder;

/**
 * 
 * builder design pattern - Builder pattern builds a complex object using simple
 * objects and using a step by step approach. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to
 * create an object. A Builder class builds the final object step by step. This
 * builder is independent of other objects.
 *
 *
 * Implementation 
 * We've considered a business case of fast-food restaurant where
 * a typical meal could be a burger and a cold drink. Burger could be either a
 * Veg Burger or Chicken Burger and will be packed by a wrapper. Cold drink
 * could be either a coke or pepsi and will be packed in a bottle. We're going
 * to create an Item interface representing food items such as burgers and cold
 * drinks and concrete classes implementing the Item interface and a Packing
 * interface representing packaging of food items and concrete classes
 * implementing the Packing interface as burger would be packed in wrapper and
 * cold drink would be packed as bottle. We then create a Meal class having
 * ArrayList of Item and a MealBuilder to build different types of Mealobject by
 * combining Item. BuilderPatternDemo, our demo class will use MealBuilder to
 * build a Meal.
 * 
 * Wiki - https://en.wikipedia.org/wiki/Builder_pattern 
 * SOF1 - https://stackoverflow.com/questions/328496/when-would-you-use-the-builder-pattern 
 * SOF2 - https://stackoverflow.com/questions/55748815/why-do-we-need-to-use-the-builder-design-pattern-when-we-can-do-the-same-thing-w 
 * 
 */

public class App {
	
	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new  MealBuilder();
		Meal vegMeal = mealBuilder.getVegMeal();
		vegMeal.showItems();
		// showCost()
		
		Meal nonVegMeal = mealBuilder.getNonVegMeal();
		nonVegMeal.showItems();
		// showCost()
		
		
		
		
	}
	
	

}
