package polymorphismer;

public class Splender extends Bike {
	public void run() {
		System.out.println("Running Splender Bike.");
	}

	public static void main(String[] args) {
		Bike b = new Splender();
		b.run();
	}

}
