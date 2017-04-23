package stacks_queues;

import java.util.ArrayList;

public class Stack {
	public int maxLength;
	private int top;
	
	private ArrayList<String> list;
	
	public Stack(int l){
		this.maxLength =l;
		list = new ArrayList<String>();
	}
	
	public void push(String s){
		if(isFull()){
			System.out.println("Chill max length reached dude");
		}
		else{
			list.add(top,s);
		}
	}
	
	public String pop(){
		if(isEmpty()){
			System.out.println("No data to retrieve!");
			return null;
		}
		else
			return list.remove(top);
	}
	
	public String peek(){
		if(isEmpty()){
			System.out.println("No data to retrieve!");
			return null;
		}
		else
			return list.get(top);
	}

	public boolean isFull(){
		return list.size()==maxLength;
	}
	
	public boolean isEmpty(){
		return list.size()==0;
	}
	
}
