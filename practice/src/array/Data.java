package array;

public class Data {
	private int intarray[];
	private float floatarray[];
	private boolean booleanarray[];
	
	Data(){
		
	}

	public int[] getIntarray() {
		
		return intarray;
	}


	public void setIntarray(int[] intarray) {
		this.intarray = intarray;
	}


	public float[] getFloatarray() {
		return floatarray;
	}


	public void setFloatarray(float[] floatarray) {
		this.floatarray = floatarray;
	}


	public boolean[] getBooleanarray() {
		return booleanarray;
	}


	public void setBooleanarray(boolean[] booleanarray) {
		this.booleanarray = booleanarray;
	}


	Data(int intarray[], float floatarray[], boolean booleanarray[]) {
		this.intarray = intarray;
		this.floatarray = floatarray;
		this.booleanarray = booleanarray;
	}
}
