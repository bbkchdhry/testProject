package interfaceExample;

public abstract  class DataSource extends A implements Cluster  {

	
	abstract public boolean PutInCluster(int a);
	

	@Override
	public int GetDataFromCluster(String ClusterName) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
