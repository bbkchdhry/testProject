package tryproject;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		float x = scan.nextFloat();
		System.out.println("Enter another number: ");
		float y = scan.nextFloat();
		System.out.println("Enter a word: ");
		String ch = scan.next();
		float calc, calc1;
		switch (ch) {
		case "sum":
			calc = x + y;
			System.out.println("Sum : " + calc);
			break;

		case "diff":
			calc = x - y;
			System.out.println("Difference : " + calc);
			break;
		case "mul":
			calc = x * y;
			System.out.println("Multiplication : " + calc);
			break;
		case "div":
			calc1 = x / y;
			System.out.println("Division : " + calc1);
			break;
		default:

			break;
		}

		scan.close();
	}
}
