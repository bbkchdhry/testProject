package tryproject;

import java.util.Scanner;

public class Calculator3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		System.out.println("Enter another number: ");
		int y = scan.nextInt();

		System.out.println("Choose + for Sum");
		System.out.println("Choose - for Difference");
		System.out.println("Choose * for Multiplication");
		System.out.println("Choose / for Division");
		String ch = scan.next();
		int calc;

		switch (ch) {
		case "+":
			calc = x + y;
			System.out.println("Sum: " + calc);
			break;

		case "-":
			calc = x - y;
			System.out.println("Difference: " + calc);
			break;
		case "*":
			calc = x * y;
			System.out.println("Multiplication: " + calc);
			break;
		case "/":
			calc = x / y; // It needs to be converted from Int to Float
			System.out.println("Division: " + calc);
			break;
		default:

			break;
		}
		scan.close();
	}
}
