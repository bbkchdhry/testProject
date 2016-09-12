package finalkeyword;

public class MomoType extends Momo {
	String momotype;
	String vehiclename;

	MomoType(int price, String name, String momotype) {
		super(price, name);

		this.momotype = momotype;
	}

	String homeDelivery(String name, String vehicle) {
		return name + vehicle;
	}

	@Override
	String deliverMomo() {
		String x = super.deliverMomo();

		vehiclename = "bike";
		String k = homeDelivery(x, vehiclename);
		return k;
	}

}
