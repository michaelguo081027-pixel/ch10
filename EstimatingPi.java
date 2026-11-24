public class EstimatingPi {
	public static void main (String[] args) {
		Fraction MILU=new Fraction(355, 113);
		final double EPSILON=Math.abs(Math.PI-MILU.toDouble());
		int n=3;
		int d=1;
		Fraction ESTIMATE=new Fraction(n,d);
	}
}

