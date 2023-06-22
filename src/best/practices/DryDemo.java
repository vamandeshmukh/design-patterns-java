package best.practices;

public class DryDemo {

	static double calcGst(double amount) {
		// gst calc logic
//		return amount + (amount * 0.18);
		return amount + (amount * 0.18) + 60;
	}

	public static void main(String[] args) {

//		System.out.println(calcGst(100) + 50);
//		System.out.println(calcGst(500) + 50);
//		System.out.println(calcGst(200) + 50);

		System.out.println(calcGst(100));
		System.out.println(calcGst(500));
		System.out.println(calcGst(200));
	}

}

//	DRY - Don't repeat yourself. 

// business logic 
// GST calc 

// Single source of truth 

class ServciceCenter {

	void carService() {
		// core service
		// vehicle washing - 2
	}

	void bikeService() {
		// core service
		// vehicle washing - 2
	}
}

class ServciceCenter2 {

	void carService() {
		// core service
		vehicleWash();
	}

	void bikeService() {
		// core service
		vehicleWash();
	}

	void vehicleWash() {
		// vehicle washing
		// vehicle washing - 2
	}
}
