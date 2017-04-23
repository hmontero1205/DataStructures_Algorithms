package stacks_queues;

import java.util.ArrayList;

public class Stack {
	public int maxLength;
	private ArrayList<String> list;
	
	public Stack(int l){
		this.maxLength =l;
		list = new ArrayList<String>();
	}
	
	public void push(String s){
		if(!isFull()){
			list.add(0,s);
		}
		else{
			System.out.println("Chill max length reached dude");
		}
	}
	
	public String pop(){
		if(isEmpty()){
			System.out.println("No data to retrieve!");
			return null;
		}
		else
			return list.remove(0);
	}
	
	public String peek(){
		if(isEmpty()){
			System.out.println("No data to retrieve!");
			return null;
		}
		else
			return list.get(0);
	}

	public boolean isFull(){
		return list.size()==maxLength;
	}
	
	public boolean isEmpty(){
		return list.size()==0;
	}
	
}
