package oops;

public class ThisDemo {
	int id;
	String name;

	ThisDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ThisDemo s1 = new ThisDemo(111, "Karan");
		ThisDemo s2 = new ThisDemo(321, "Aryan");
		s1.display();
		s2.display();
	}

}
