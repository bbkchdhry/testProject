package datatype;

public class RobertFactory {

	public static void main(String[] args) {
		Robert robert = new Robert();
		robert.createLifeSpan(10);
		Charger charger = new Charger();
		charger.chargeRobert(robert);
	}

}
