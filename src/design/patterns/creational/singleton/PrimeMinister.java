package design.patterns.creational.singleton;

// singleton class - example 2 
public class PrimeMinister {

	// lazy loading - singleton
	private static PrimeMinister obj;

	int sid;

	private PrimeMinister() {
		super();
	}

	// synchronized method - thread safety 
	public static synchronized PrimeMinister getInstance() {
		if (obj == null)
			obj = new PrimeMinister();
		return obj;
	}

}

//package design.patterns.creational.singleton;
//
//// singleton class - example 2 
//public class PrimeMinister {
//
//	// lazy loading - singleton
//	private static PrimeMinister obj;
//
//	int sid;
//
//	private PrimeMinister() {
//		super();
//	}
//
//	public static PrimeMinister getInstance() {
//		if (obj == null)
//			obj = new PrimeMinister();
//		return obj;
//	}
//
//}

//package design.patterns.creational.singleton;
//
//// singleton class - basic example 
//public class PrimeMinister {
//	
//	// early loading - singleton 
//	private static PrimeMinister obj = new PrimeMinister();
//	
//	int sid;
//	
//	private PrimeMinister() {
//		super();
//	}
//	
//	public static PrimeMinister getInstance() {
//		return obj;
//	}
//
//}
