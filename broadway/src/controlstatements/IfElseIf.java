package controlstatements;

public class IfElseIf {

	public static void main(String[] args) {
		int marks = 78;
		if (marks >= 80) {
			System.out.println("Distinction");
		} else if (marks >= 70) {
			System.out.println("First Division");
		} else if (marks >= 50) {
			System.out.println("Second Division");
		} else if (marks >= 32) {
			System.out.println("Third Division");
		} else {
			System.out.println("Fail");
		}

	}
}
