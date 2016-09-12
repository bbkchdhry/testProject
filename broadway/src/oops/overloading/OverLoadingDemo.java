package oops.overloading;

public class OverLoadingDemo {
	private int id;
	private String name;
	private int age;

	public OverLoadingDemo(int i, String n) {
		id = i;
		name = n;
	}

	public OverLoadingDemo(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	public void display1() {
		System.out.println(id + " " + name);
	}

	public void display2() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {

		OverLoadingDemo s1 = new OverLoadingDemo(101, "Rajesh");
		s1.display1();
		OverLoadingDemo s2 = new OverLoadingDemo(101, "Rajesh", 19);
		s2.display2();
	}

}
