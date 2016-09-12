package controlstatements;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int a = 0; a < 10; a++) {
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}

}
