package best.practices;

// KISS - Keep it simple, stupid. 

public class KissDemo {

	int getMax(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}

	int getMax2(int i, int j) {
		return (i > j) ? i : j;
	}

	String getMonth(int month) {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		default:
			return "Invalid input!";
		}
	}

	String getMonth2(int month) {

		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		default:
			return "Invalid input!";
		}
	}

}
