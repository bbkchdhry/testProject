package abstractExample;

public class HumanLife extends Life{
@Override
void eat(){
	super.breath();
	System.out.println("Human Eat");
}
@Override
void live(){
	System.out.println("Human Live");
}

public static void main(String[] args) {
	
	HumanLife obj=new HumanLife();
	obj.eat();
	obj.live();
	
	AnimalLife obj2=new AnimalLife();
	obj2.eat();
	obj2.live();
	
}


}
