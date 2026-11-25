public class EstimatingPi {
	public static void main (String[] args) {
		Fraction MILV=new Fraction(355, 113);
		final double EPSILON=Math.abs(Math.PI-MILV.toDouble());
		int n=3;
		int d=1;
		Fraction ESTIMATE=new Fraction(n,d);
		while(n<1000000&&d<1000000){
			if(Math.abs(ESTIMATE.toDouble()-MILV.toDouble())<EPSILON){
				n++;
				ESTIMATE.setNum(n);
			}else{
				d++;
				ESTIMATE.setDenom(d);
			}
		}
		System.out.println(ESTIMATE);
	}
}

