package binarytrees;

public class Node {
	public int data;
	public Node leftChild;
	public Node rightChild;
	public Node parent;
	
	public Node(int d){
		this.data=d;
		this.leftChild=null;
		this.rightChild=null;	
		this.parent=null;
	}
}
