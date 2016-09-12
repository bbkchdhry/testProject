package oops.constructor;

public class ThisConstructor {
	int id;
	String name;

	ThisConstructor() {
		System.out.println("default constructor is invoked");
	}

	ThisConstructor(int id, String name) {
		this();// it is used to invoked current class constructor.
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ThisConstructor e1 = new ThisConstructor(111, "karan");
		ThisConstructor e2 = new ThisConstructor(222, "Aryan");
		e1.display();
		e2.display();
	}
}
