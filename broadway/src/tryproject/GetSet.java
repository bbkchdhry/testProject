package tryproject;

public class GetSet {
	private int roll;
	private String name;

	public void SetRoll(int roll) {
		this.roll = roll;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		GetSet bibek = new GetSet();
		bibek.SetRoll(101);
		bibek.SetName("Bibek Chaudhary");
		System.out.println("Roll : " + bibek.getRoll());
		System.out.println("Name : " + bibek.getName());
	}
}
