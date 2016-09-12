package oops.constructor;

public class NoThis {
	int id;
	String name;

	NoThis(int id, String name) {
		/*id = id;
		name = name;*/
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		NoThis s1 = new NoThis(111, "Karan");
		NoThis s2 = new NoThis(321, "Aryan");
		s1.display();
		s2.display();
	}

}
