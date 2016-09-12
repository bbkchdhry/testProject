package staticVariable;

public class C {
	void m() {
		A d = new A();
		int c = A.a;// a is static type so we need to access through class name
		System.out.println(d);
		System.out.println(c);
		
	}
}
