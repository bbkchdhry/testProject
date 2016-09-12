package staticVariable;

public class B {

	public static void main(String[] args) {
		A x = new A();
		A y = new A();
		A z = new A();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		C a = new C();
		a.m();
	}

}
