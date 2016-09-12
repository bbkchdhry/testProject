package startingproject;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		System.out.println("Enter another number: ");
		int y = scan.nextInt();
		int sum = x + y;
		System.out.println("The sum = " + sum);
scan.close();
	}
}
