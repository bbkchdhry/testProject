package oops.overloading;

public class MethodOverloadingTest2 {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(double a,double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloadingTest2 obj = new MethodOverloadingTest2();
		obj.sum(10, 10);
		obj.sum(10.5, 10.5);
	}

}
