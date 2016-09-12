package sort;

public class Sort_first {

	public static void main(String[] args) {

		int[] a = { 7, 2, 5, 8, 9, 10};
		for (int j = 0; j<a.length; j++) {

			for (int i = j + 1; i < a.length; i++) {
				if (a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);

		}
	}
}
