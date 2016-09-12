package overriding;

public class OverridingMethod extends AObject{
	@Override
	void toEatMeat(){
	
	String meat="Meat";
	System.out.println(meat);
	super.toEatMeat();
	}
	
	public static void main(String[] args) {
		OverridingMethod obj1=new OverridingMethod();
		AObject obj2=new AObject();
		obj1.toEatMeat();
		obj2.toEatMeat();
	}
}
