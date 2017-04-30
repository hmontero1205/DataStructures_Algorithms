package binarytrees;

public class Main {
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.insert(new Node(10));
		tree.insert(new Node(5));
		tree.insert(new Node(15));
		tree.insert(new Node(1));
		tree.insert(new Node(7));
		tree.insert(new Node(12));
		tree.insert(new Node(17));
		
//		tree.preorderTraversal(tree.root);
//		System.out.println("");
//		tree.postorderTraversal(tree.root);
//		System.out.println("");
		tree.inorderTraversal(tree.root);
		tree.delete(10);
		System.out.println("");
		tree.inorderTraversal(tree.root);
	}
}
