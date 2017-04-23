package stacks_queues;

import java.util.ArrayList;

public class Queue {
	public int front;
	public int rear;
	private int maxLength;
	private ArrayList<String> list;
	
	public Queue(int l){
		this.maxLength = l;
		this.list = new ArrayList<String>();
	}
	
	public void enqueue(String s){
		if(isFull()){
			System.out.println("Cannot enqueue '"+s+"'. Max length reached :(");
		}
		else{
			list.add(s);
			rear++;
		}
	}
	
	public String dequeue(){
		if(isEmpty()){
			System.out.println("Dequeue failed. No items in queue.");
			return null;
		}
		else{
			rear--;
			return list.remove(front);
		}
	}
	
	public boolean isFull(){
		return rear==maxLength;
	}
	
	public boolean isEmpty(){
		return rear==0;
	}
	
	public String peek(){
		if(isEmpty()){
			System.out.println("Dequeue failed. No items in queue.");
			return null;
		}
		else{
			return list.get(front);
		}
	}
}

