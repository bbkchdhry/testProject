package controlstatements;
public class SwitchDemo {
	public static void main(String[] args) {
		int week = 5;
		String weekString;
		switch (week) {
		case 1:
			weekString = "Sunday";
			break;
		case 2:
			weekString = "Monday";
			break;
		case 3:
			weekString = "Tuesday";
			break;
		case 4:
			weekString = "Wednesday";
			break;
		case 5:
			weekString = "Thursday";
			break;
		case 6:
			weekString = "Friday";
			break;
		default:
			weekString = "Saturday";
			break;
		}
		System.out.println(weekString);
	}
}
