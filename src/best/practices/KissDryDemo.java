package best.practices;

public class KissDryDemo {

	int berthNumber = 10; // 1 to 72
	String berthType = ""; // lower, middle, upper, side-lower, side-upper

	String getBerthType(int berthNumber) {
		// better logic ?
		return null;
	}

	String getBerthType2(int berthNumber) {
		if (berthNumber < 1 || berthNumber > 72)
			return "Invalid input!";
		String[] berthTypes = { "lower", "middle", "upper", "lower", "middle", "upper", "side-lower", "side-upper" };
		return berthTypes[berthNumber % 8];
	}

	String getBerthType3(int berthNumber) {
		String berthType = "";
		if (berthNumber >= 1 && berthNumber <= 72) {
			if (berthNumber % 8 == 1 || berthNumber % 8 == 4)
				berthType = "lower";
			else if (berthNumber % 8 == 2 || berthNumber % 8 == 5)
				berthType = "middle";
			else if (berthNumber % 8 == 4 || berthNumber % 8 == 6)
				berthType = "upper";
			else if (berthNumber % 8 == 7)
				berthType = "side-lower";
			else
				berthType = "side-upper";
		} else {
			return "Invalid input!"; // ex 
		}
		return berthType;
	}
}
