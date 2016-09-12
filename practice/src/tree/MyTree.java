package tree;

public class MyTree {

	int data;
	MyTree leftnode;
	MyTree rightnode;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public MyTree getLeftnode() {
		return leftnode;
	}

	public void setLeftnode(MyTree leftnode) {
		this.leftnode = leftnode;
	}

	public MyTree getRightnode() {
		return rightnode;
	}

	public void setRightnode(MyTree rightnode) {
		this.rightnode = rightnode;
	}

	MyTree(int data) {
		this.data = data;
	}

	public void getLeftData(MyTree x) {

		while (x.getLeftnode() != null) {
			MyTree left = x.getLeftnode();
			System.out.println(x.getData());
			x = left;
		}
		System.out.println(x.getData());
	}

	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]={4,5,6,7};
		int i=0;
		int a1=a[i];
		MyTree root=new MyTree(a1);
		while(a.length!=i){
			int y=a[i+1];
			MyTree nodeleft=new MyTree(y);
			root.setLeftnode(nodeleft);
			int b1=b[i];
			MyTree noderight=new MyTree(b1);
			root.setRightnode(noderight);
			
		}
	}
}
