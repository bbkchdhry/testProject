package tryproject;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		System.out.println("Enter another number: ");
		int y = scan.nextInt();

		System.out.println("Enter a word: ");
		String ch = scan.next();
		int calc;

		switch (ch) {
		case "sum":
			calc = x + y;
			break;

		case "diff":
			calc = x - y;
			break;
		case "mul":
			calc = x * y;
			break;
		case "div":
			calc = x / y; //It needs to be converted from Int to Float
			break;
		default:
			calc = 0;
			break;
		}
		System.out.println("The required answer is: " + calc);
		scan.close();
	}
}
