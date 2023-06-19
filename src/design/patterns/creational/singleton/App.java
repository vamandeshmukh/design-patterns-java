package design.patterns.creational.singleton;

public class App {
	
	public static void main(String[] args) {
		
		PrimeMinister obj = PrimeMinister.getInstance();
		PrimeMinister obj2 = PrimeMinister.getInstance();
		
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());


		
	}

}
