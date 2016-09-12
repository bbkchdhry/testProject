package staticVariable;

public class StaticMain2 {
	public static void main(String[] args) {
		
		StaticVariable2 obj = new StaticVariable2();
		obj.staticVariable();
		System.out.println(StaticVariable2.noOfObject);
		System.out.println(obj.x);
		

		StaticVariable2 obj2 = new StaticVariable2();
		
		System.out.println(StaticVariable2.noOfObject);
		System.out.println(obj2.x);
		
		obj2.staticVariable();
		System.out.println(StaticVariable2.noOfObject);
		System.out.println(obj2.x);
		
		obj2.staticVariable();
		System.out.println(StaticVariable2.noOfObject);
		System.out.println(obj2.x);	
	}
}
