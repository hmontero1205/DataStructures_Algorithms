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
						n.parent = previous;
						break;
					}
					previous = previous.leftChild;
				}
				else{
					if(previous.rightChild==null){
						previous.rightChild=n;
						n.parent=previous;
						break;
					}
					previous = previous.rightChild;
				}
			}
		}
	}
	
	public void delete(int n){
		Node toDelete = search(n);
		if(toDelete==null)
			System.out.println("Couldn't find node :(");
		else{
			if(toDelete.leftChild!=null && toDelete.rightChild!=null){
				//case 1: has two children -> replace with 2nd greatest in subtree, one to the right, all the way to the left(successor)
				Node successor = getSuccessor(toDelete.rightChild);
				successor.parent.leftChild=successor.rightChild;//null if no right child.
				toDelete.data = successor.data;//replaces with successor
			}
			else{
				if(toDelete.leftChild==null && toDelete.rightChild==null){
					//case 2: has no children
					if(toDelete.data<toDelete.parent.data)
						toDelete.parent.leftChild = null;
					else
						toDelete.parent.rightChild = null;
				}
				if(toDelete.leftChild!=null){
					//case 3: only has left child
					if(toDelete.data<toDelete.parent.data)
						toDelete.parent.leftChild = toDelete.leftChild;
					else
						toDelete.parent.rightChild = toDelete.leftChild;
					
				}
				if(toDelete.rightChild!=null){
					//case 4: only has right child
					if(toDelete.data<toDelete.parent.data)
						toDelete.parent.leftChild = toDelete.rightChild;
					else
						toDelete.parent.rightChild = toDelete.rightChild;
					
				}
			}	
		}
	}

	public Node getSuccessor(Node n){
		while(n.leftChild!=null){
			n=n.leftChild;
		}
		return n;
	}
	public Node search(int d){
		if(root.data==d)
			return root;
		else{
			if(root==null)
				return null;
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
	
	public void preorderTraversal(Node root){
		if(root==null)
			return;
		else{
			System.out.print(root.data+" ");
			preorderTraversal(root.leftChild);
			preorderTraversal(root.rightChild);
		}
	}
	
	public void postorderTraversal(Node root){
		if(root==null)
			return;
		else{
			postorderTraversal(root.leftChild);
			postorderTraversal(root.rightChild);
			System.out.print(root.data+" ");
		}
	}
	
	public void inorderTraversal(Node root){
		if(root==null)
			return;
		else{
			inorderTraversal(root.leftChild);
			System.out.print(root.data+" ");
			inorderTraversal(root.rightChild);
		}
	}
}
