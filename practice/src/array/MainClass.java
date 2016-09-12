package array;

public class MainClass {

	public static void main(String[] args) {
		int[] intarray = new int[10];
		float[] floatarray = new float[10];
		boolean[] booleanarray = new boolean[10];

		Data x = new Data(intarray, floatarray, booleanarray);
		Data[] totaldata = new Data[3];
		totaldata[0] = x;
		
		Data y = totaldata[0];
		int[] x1 = y.getIntarray();
		int firstind = x1[0]; // taking value of specific index
		int secondind = x1[2];
		System.out.println(firstind);
		System.out.println(secondind);

		Data y1 = new Data(intarray, floatarray, booleanarray);
		intarray[0] = 1;
		booleanarray[0] = true;
		totaldata[1] = y1;
		
		Data obj=new Data();
		int[] a={1,2,3,4,5};
		obj.setIntarray(a);
		int[] b=obj.getIntarray();
		for(int i=0;i<5;i++){
			System.out.println(b[i]);
		}
		
		
		
/*
		Data i = totaldata[1];
		int[] x2 = i.getIntarray();
		boolean[] x3 = i.getBooleanarray();
		int fintind = x2[0];
		boolean fbooleanind = x3[0];

		System.out.println(fintind);
		System.out.println(fbooleanind);*/

		Data z = new Data(intarray, floatarray, booleanarray);
		floatarray[0] = (float) 1.0;
		booleanarray[0] = false;
		totaldata[2] = z;

		Data j = totaldata[2];
		float[] l = j.getFloatarray();
		boolean[] m = j.getBooleanarray();
		float find = l[0];
		boolean fbind = m[0];

		System.out.println(find);
		System.out.println(fbind);

	}
}
