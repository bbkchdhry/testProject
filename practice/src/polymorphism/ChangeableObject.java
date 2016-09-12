package polymorphism;

import interfaceExample.Cluster;
import interfaceExample.EncryptedDataSource;
import interfaceExample.HighlyEncryptedDataSource;

public class ChangeableObject {
	Cluster cluster;

	ChangeableObject(Cluster cluster) {
		this.cluster = cluster;
	}

	int getData() {
		int data = cluster.GetDataFromCluster();
		return data;
	}

	public static void main(String[] args) {
		HighlyEncryptedDataSource y = new HighlyEncryptedDataSource();
		ChangeableObject x = new ChangeableObject(y);

		EncryptedDataSource y1 = new EncryptedDataSource();
		ChangeableObject x1 = new ChangeableObject(y1);

		x.getData();
		x1.getData();
	}
}
