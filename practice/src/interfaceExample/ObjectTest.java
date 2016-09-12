package interfaceExample;

public class ObjectTest {

	void normalCase(Cluster x)
	{
		x.GetDataFromCluster();
	}
	
	public static void main(String[] args) {
		ObjectTest obj=new ObjectTest();
		EncryptedDataSource obj1 =new EncryptedDataSource();
		HighlyEncryptedDataSource obj2 =new HighlyEncryptedDataSource();
		obj.normalCase(obj1);
		obj.normalCase(obj2);
	}
}
