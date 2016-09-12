package oops;

public class CounterWithStatic {
	static int count;//will get memory when class is loaded and retain its value

	static{
		System.out.println("static block is invoked");
		//System.exit(0);
	}
	CounterWithStatic() {
		count++;
	}

	private void showCount() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		new CounterWithStatic().showCount();
		new CounterWithStatic().showCount();
		new CounterWithStatic().showCount();
		/*System.out.println(count);*/
	}

}
