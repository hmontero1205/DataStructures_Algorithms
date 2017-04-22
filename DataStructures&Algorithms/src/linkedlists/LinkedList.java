package linkedlists;

import java.util.ArrayList;

public class LinkedList {
	//private ArrayList<Node> list;
	public Node head;
	
	public LinkedList(){
		//this.list = new ArrayList<Node>();
	}
	
	public void insert(String k, String d){
		Node newNode = new Node(k,d);
		if(head==null){
			newNode.next=null;
		}
		else{
			newNode.next=head;
		}
		head = newNode;
		//list.add(0,head);
	}
	public Node deletion(){
		if(head==null)
			return null;
		else{
			Node toRemove = head;
			head = head.next;
			return toRemove;
			//return list.remove(0);
		}
	}
	public Node search(String k){
		Node n = head;
		while(n!=null){
			if(n.key.equals(k)){
				return n;
			}
			n = n.next;
		}
		return null;
	}
	public void display(){
		Node current = head;
		System.out.print("{");
		while(current!=null){
			if(current!=head)
				System.out.println(",");
			System.out.print("(key:" +current.key+",data:"+current.data+")");
			current = current.next;
		}
		System.out.println("}");
	}
	public Node delete(String k){
		if(head==null)
			return null;
		else{
			if(head.key.equals(k)){
				return deletion();
			}
			else{
				//i appreciate amber's pretty vaping face xD
				Node prev = head;
				Node current = head.next;
				while(current!=null){
					if(current.key.equals(k)){
						Node toDelete = current;
						prev.next=toDelete.next;
						return toDelete;
					}
					prev=current;
					current=current.next;
				}
				return null;
			}
		}
		
	}
}
