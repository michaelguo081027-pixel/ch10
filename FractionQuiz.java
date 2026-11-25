import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
	public static void main (String[] args) {
		Random random = new Random();
		String[] operator = {"+", "-", "*", "/"};
		int choose = random.nextint(3)-1;
		Scanner in = new Scanner();
		Fraction f1 = new Fraction(random.nextint(9)-1, random.nextint(9)-1);
		Fraction f2 = new Fraction(random.nextint(9)-1, random.nextint(9)-1);
		System.out.println("Welcome to Fraction Quiz. Please enter answer in lowest terms. Enter 'quit' to end quiz.");
		String o = operator[choose];
		System.out.print(f1.toString()+" "+o+" "f2.toString()+"= ");
		String answer=in.nextString();
	}
	
	public static void operate(Fraction f1, String operator, Fraction f2, String answer){
		if(operator="+"){
			Fraction correct = Fraction.add(f1, f2);
		}else if(operator="-"){
			Fraction correct = Fraction.sub(f1, f2);
		}if(operator="*"){
			Fraction correct = Fraction.mult(f1, f2);
		}if(operator="/"){
			Fraction correct = Fraction.div(f1, f2);
		}
		Fraction reply = new Fraction(answer);
		if(equals(correct, reply)){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect. Correct Answer: "+correct);
		}
		System.out.println(" ");
	}
	
	public static boolean equals (Fraction F, Fraction f){
		return F==f;
	}
}

