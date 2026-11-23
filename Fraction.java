public class Fraction {
	//instance variables (attributes, fields)
	private int numerator, denominator;
	//constructors
	public Fraction () {	//default constructor
		numerator = 1;
		denominator = 1;
	}
	//parameterized constructor
	public Fraction (int n, int d) {
		setNum(n);
		setDenom(d);
	}
	
	public Fraction (String s) {
		int n = Integer.parseInt(s.substring(0, s.indexOf("/")));
		int d = Integer.parseInt(s.substring(s.indexOf("/")+1));
		setNum(n);
		setDenom(d);
	}
	
	public Fraction (Fraction f) {
		numerator = f.getNum();
		denominator = f.getDenom();
	}
	//behavior methods (accessor, mutator, helper)
	//accessor method
	public int getNum() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	//mutator method
	public void setNum(int n){
		numerator = n;
	}
	
	public void setDenom(int d){
		if (d != 0) denominator = d;
		else {
			denominator = 1;
			System.out.println("Error: denominator cannot be zero");
		}
	}
	
	public void reduce(int a, int b){
		int c=a;
		int d=b;
		while(c!=d){
			if(c>d)c=c-d;
			else d=d-c;
		}
		denominator=c;
	}
	//static method
	public static Fraction mult (Fraction a, Fraction b){
		int n = a.getNum() * b.getNum();
		int d = a.getDenom() * b.getDenom();
		Fraction product = new Fraction(n,d);
		return product;
	}
	
	public static Fraction div (Fraction a, Fraction b){
		int n = a.getNum() * b.getDenom();
		int d = a.getDenom() * b.getNum();
		Fraction quotient = new Fraction(n,d);
		return quotient;
	}
	
	public static Fraction add (Fraction a, Fraction b){
		int x=a.getNum();
		int y=b.getNum();
		int z=a.getDenom();
		int k=b.getDenom();
		reduce(z, k);
		x=x*(denominator/z);
		y=y*(denominator/k);
		int n=x+y;
		Fraction sum = new Fraction(n, denominator);
		return sum;
	}
}
