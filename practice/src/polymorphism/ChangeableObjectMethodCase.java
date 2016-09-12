package polymorphism;

import interfaceExample.Cluster;
import interfaceExample.EncryptedDataSource;
import interfaceExample.HighlyEncryptedDataSource;

public class ChangeableObjectMethodCase {
	int getData(Cluster x) {
		int data = x.GetDataFromCluster();
		return data;
	}

	public static void main(String[] args) {
		ChangeableObjectMethodCase obj1 = new ChangeableObjectMethodCase();
		
		HighlyEncryptedDataSource y1 = new HighlyEncryptedDataSource();
		obj1.getData(y1);
		
		EncryptedDataSource y2=new EncryptedDataSource();
		obj1.getData(y2);

	}

}
