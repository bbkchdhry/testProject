package interfaceExample;

public interface Cluster {
   
	abstract boolean PutInCluster(int a);
	int GetDataFromCluster();
	public final static int TotalNoOfCluster=100;
	
}
