package stacks_queues;

public class Main {
	public static void main(String[] args){
		Queue myQ = new Queue(5);
		myQ.enqueue("Meme1");
		myQ.enqueue("Meme2");
		//System.out.println(myQ.dequeue());
		myQ.enqueue("Meme3");
		myQ.enqueue("Meme4");
		myQ.enqueue("Meme5");
		myQ.enqueue("Meme6");
		while(!myQ.isEmpty()){
			System.out.println(myQ.dequeue());
		}
		
	}
}
