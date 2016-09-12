package multithread;

public class Practice3 implements Runnable {

	Practice a;
	Practice2 b;

	@Override
	public void run() {

	}

	Practice3(Practice a) {
		this.a = a;
	}

	Practice3(Practice2 b) {
		this.b = b;
	}

	public static void main(String[] args) {

		Practice obj1 = new Practice();
		Practice2 obj2 = new Practice2();

		obj1.setId(101);
		obj2.setName("Bibek");
		
		Practice3 pobj1=new Practice3(obj1);
		Practice3 pobj2=new Practice3(obj2);
		
		Thread th1=new Thread(pobj1);
		Thread th2=new Thread(pobj2);
		
		th1.start();
		th2.start();
		
		
		System.out.println(obj1.getId());
		System.out.println(obj2.getName());
	}

}
