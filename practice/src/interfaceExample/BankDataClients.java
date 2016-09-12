package interfaceExample;

public class BankDataClients extends DataSource{

	@Override
	public boolean PutInCluster(int a) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		BankDataClients obj =new BankDataClients();
		obj.GetDataFromCluster("rajan");
		obj.PutInCluster(2);
	}

	@Override
	public int GetDataFromCluster() {
		// TODO Auto-generated method stub
		return 0;
	}

}
