package solid.principles;

import java.util.ArrayList;
import java.util.List;

public class SingleDemo {

}

class Product {

	// data only about the product
}

class Order {

}

class CrudRepo {

}

class EmpRepo extends CrudRepo {

}

interface Bank {

}

class Citi implements Bank {

}

class Deutsche implements Bank {

}

class Demo {

	Bank citi = new Citi();
	Bank deutsche = new Deutsche();
	Citi citi2 = new Citi();

	public static void main(String[] args) {

		List<Object> l1 = new ArrayList<>();
//		l1.

		ArrayList<Object> l2 = new ArrayList<>();
//		l2.
	}

}

interface Rbi {

	// rules common for all
	// rules for commercial banks
	// rules for NBFC
	// rules for cooperative societies

}

interface Rbi1 {

	// rules common for all

}

interface Rbi2 extends Rbi1 {

	// rules for commercial banks

}

interface Rbi3 {

	// rules for NBFC

}

interface Rbi4 {

	// rules for cooperative societies

}
