package finalkeyword;

public class Momo {
	static int counter = 0;
	int price;
	String name;
	String waitername;

	
	String deliverMomo(){
	waitername="David";
	return waitername;
	}
	
	
	Momo(int price, String name) {
		this.price = price;
		this.name = name;
	}

	 final Momo getMomo() {
		String name=this.name;
		if(name.equals("Veg")){
			counter++;
		}
		return this;
	}
	  
	 static int getTotalVegSell(){
		 return counter;
	 }
}
