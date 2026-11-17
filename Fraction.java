public class Fraction {
	//instancr variables (attributes, fields)
	private int numerator, denominator;
	//constructors
	public Fraction () {	//default constructor
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction (int n, int d) {	//parameterized constructor
		numerator = n;
		denominator = d;
	}
	//behavior methods (accessor, mutator, helper)
	public int getNum() {	//accessor method
		return numerator;
	}
	
	public int getDenom() {	//accessor method
		return denominator;
	}
}

