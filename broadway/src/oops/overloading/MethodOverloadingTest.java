package oops.overloading;

public class MethodOverloadingTest {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		MethodOverloadingTest obj = new MethodOverloadingTest();
		obj.sum(10, 10);
		obj.sum(10, 20, 30);
	}

}
