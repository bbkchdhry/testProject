package controlstatements;

public class NestedIf {

	public static void main(String[] args) {
		int a = 10;
		if (a > 0) {
			if (a == 10) {
				System.out.println("The value of a is: " + a);
			} else {
				System.out.println("The value of a is not 10");
			}
		} else {
			System.out.println("The value of a is not greater than 0");
		}
	}
}
