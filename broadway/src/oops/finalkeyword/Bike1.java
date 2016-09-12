package oops.finalkeyword;

public class Bike1 {
final int speedlimit=10;
	void run(){
		int speedlimit=400;//speedlimit=400; shows compile time error as final variable cannot be changed.
		System.out.println(speedlimit);
		
	}
	public static void main(String[] args) {
		Bike1 obj=new Bike1();
		obj.run();
	}

}
