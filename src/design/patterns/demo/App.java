package design.patterns.demo;

/**
 * 
 * @author Vaman Deshmukh 
 * Git repo - 
 * https://github.com/vamandeshmukh/design-patterns-java 
 *
 */

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Design patterns demo");
		
		Employee emp1 = new Employee(101, "Sonu");
		Employee emp2 = new Employee(101, "Sonu");
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		
	}

}
