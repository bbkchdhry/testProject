package finalkeyword;

public class GetMomo {
	public static void main(String[] args) {

		Momo x = new Momo(100, "Veg");
		x.getMomo();
		Momo y = new Momo(100, "buff");
		y.getMomo();
		Momo x1 = new Momo(100, "Panir");
		x1.getMomo();
		Momo y1 = new Momo(100, "Chicken");
		y1.getMomo();
		Momo x2 = new Momo(100, "Veg");
		x2.getMomo();
		Momo y2 = new Momo(100, "Veg");
		y2.getMomo();
		Momo x3 = new Momo(100, "chicken");
		x3.getMomo();
		Momo y3 = new Momo(100, "Mutton");
		y3.getMomo();
		
		System.out.println(Momo.getTotalVegSell());
		
		
	}
}
