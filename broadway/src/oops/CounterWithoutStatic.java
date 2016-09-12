package oops;

public class CounterWithoutStatic {
	int count;//will get memory when object is created.

	CounterWithoutStatic() {
		count++;
	}

	private void showCount() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
	/*	System.out.println(count);*/
	}

}
