package multithread;

public class Worker implements Runnable {

	CommonObject i;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		
	}

	Worker(CommonObject object1, int value) {
		this.i = object1;
		this.value = value;

	}

	public static void main(String[] args) {
		CommonObject object1 = new CommonObject();
		CommonObject object2 = new CommonObject();

		
		Worker worker1 = new Worker(object1, 5);
		Thread threaddavid = new Thread(worker1);
		object1.setI(5);
		threaddavid.run(); //run method is called so only current thread is executed
		
		Worker worker2 = new Worker(object1, 10);
		Thread threadhari = new Thread(worker2);
		object2.setI(10);
		threadhari.start(); //First it creates a thread and then run method is called, so multiple thread can execute run method concurrently.
		
		System.out.println(object1.getI());
		System.out.println(object2.getI());
				
	}

}
