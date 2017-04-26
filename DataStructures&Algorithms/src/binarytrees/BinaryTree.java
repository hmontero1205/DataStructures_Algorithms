package binarytrees;

public class BinaryTree {
	public Node root;
	
	public BinaryTree(Node n){
		this.root=n;
	}
	
	public BinaryTree(){
		this.root=null;
	}
	
	public void insert(Node n){
		if(root==null)
			root=n;
		else{
			Node previous = root;
			while(true){
				if(n.data<previous.data){
					if(previous.leftChild==null){
						previous.leftChild=n;
						break;
					}
					previous = previous.leftChild;
				}
				else{
					if(previous.rightChild==null){
						previous.rightChild=n;
						break;
					}
					previous = previous.rightChild;
				}
			}
		}
	}
	
	public Node search(int d){
		if(root.data==d)
			return root;
		else{
			Node current = root;
			while(current.data!=d){
				if(d<current.data){
					current=current.leftChild;
				}
				else{
					current=current.rightChild;
				}
				
				if(current==null){
					return null;
				}
			}
			return current;
		}
	}
}
