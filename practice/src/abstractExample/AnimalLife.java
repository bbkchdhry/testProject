package abstractExample;

public class AnimalLife extends Life{
	@Override
	void eat(){
		super.breath();
		System.out.println("Animal eat");
	}
	@Override
	void live(){
		System.out.println("Animal Live");
	}

}
