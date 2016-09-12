package tree;

public class SimpleTree {
	
	int data;
	SimpleTree leftnode;
	SimpleTree rightnode;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}


	public SimpleTree getLeftnode() {
		return leftnode;
	}



	public void setLeftnode(SimpleTree leftnode) {
		this.leftnode = leftnode;
	}



	public SimpleTree getRightnode() {
		return rightnode;
	}



	public void setRightnode(SimpleTree rightnode) {
		this.rightnode = rightnode;
	}

	SimpleTree(int data){
		this.data=data;
	}

	
	public void getLeftData(SimpleTree x){
		
		while(x.getLeftnode()!=null){
		SimpleTree left =x.getLeftnode();
			System.out.println(x.getData());		
			x=left;
		}
		System.out.println(x.getData());
	}
	SimpleTree(){
		
	}

	public static void main(String[] args) {

		SimpleTree get=new SimpleTree();
		SimpleTree x=new SimpleTree(1);
		SimpleTree y=new SimpleTree(2);
		
		x.setLeftnode(y);
		
		SimpleTree z=new SimpleTree(3);
		
		x.setRightnode(z);
		
		SimpleTree a=new SimpleTree(4);
		SimpleTree b=new SimpleTree(5);
		SimpleTree c=new SimpleTree(6);
		SimpleTree d=new SimpleTree(7);
		
		y.setLeftnode(a);
		
		y.setRightnode(b);
		
		z.setLeftnode(c);
		
		z.setRightnode(d);
		
		get.getLeftData(x);
		
	}

}
