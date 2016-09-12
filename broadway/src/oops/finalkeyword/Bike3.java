package oops.finalkeyword;

public class Bike3 extends Bike2{
	void run1(){//overriding is not possible i.e. if "void run() was used, since final keyword is used in parent class.
	
System.out.println("Overriding is not possible");
}
public static void main(String[] args) {
	
	Bike2 bike=new Bike3();//inherits parent class even it uses final keyword.
	bike.run();
	Bike3 b=new Bike3();
	b.run1();
}
}
