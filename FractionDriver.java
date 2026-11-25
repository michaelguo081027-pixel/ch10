public class FractionDriver {	
	
	public static void main (String[] args) {
		
		Fraction fd = new Fraction();
		Fraction halfi = new Fraction(1,2);
		Fraction halfs = new Fraction("1/2");
		Fraction halff = new Fraction(halfs);
		Fraction third = new Fraction(1,3);
		Fraction product = Fraction.mult(halfi, third);
		Fraction quotient = Fraction.div(halfi, third);
		Fraction sum = Fraction.add(halfi, third);
		Fraction remaining = Fraction.sub(halfi, third);
		
		System.out.println(fd);
		System.out.println(halfi);
		System.out.println(halfs);
		System.out.println(halff);
		System.out.println(product);
		System.out.println(quotient);
		System.out.println(sum);
		System.out.println(remaining);
	}
}
