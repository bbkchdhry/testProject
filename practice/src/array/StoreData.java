package array;

public class StoreData {
	int x[];
	boolean y[];
	double z[];

	StoreData() {

	}

	StoreData(int x[], boolean y[], double z[]) {

		this.x = x;

		this.y = y;

		this.z = z;

	}

	void changeData(boolean y[]) {
		y[0] = true;
		y[1] = true;
		y[2] = false;
		y[3] = false;
	}

	public static void main(String[] args) {
		int[] x = new int[7];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;
		x[5] = 6;
		x[6] = 7;
		boolean[] y = new boolean[4];
		y[0] = false;
		y[1] = false;
		y[2] = true;
		y[3] = true;
		double[] z = new double[5];
		z[0] = 1.0;
		z[1] = 1.1;
		z[2] = 1.3;
		z[3] = 1.4;
		z[4] = 1.5;

		StoreData obj2 = new StoreData();

		StoreData obj = new StoreData(x, y, z);

		System.out.println(obj);

		for (int i = 0; i < 7; i++) {
			System.out.println(x[i]);
		}

		for (int j = 0; j < 4; j++) {
			System.out.println(y[j]);
		}

		for (int k = 0; k < 5; k++) {
			System.out.println(z[k]);
		}

		obj2.changeData(y);

		for (int l = 0; l < 4; l++) {
			System.out.println(y[l]);
		}

	}
}
