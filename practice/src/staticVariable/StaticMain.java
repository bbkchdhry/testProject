package staticVariable;

public class StaticMain {
	public static void main(String[] args) {
		int z = StaticVariable.noOfObject;
		System.out.println(z);

		StaticVariable obj = new StaticVariable();
		int y = StaticVariable.noOfObject;
		System.out.println(y);

		int o = obj.x;
		System.out.println(o);

		StaticVariable obj2 = new StaticVariable();
		int b = obj2.x;
		System.out.println(b);
		System.out.println(StaticVariable.noOfObject);
	}
}
