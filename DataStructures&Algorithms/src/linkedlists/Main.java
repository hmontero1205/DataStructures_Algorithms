package linkedlists;

public class Main {
	public static void main(String[] args){
		LinkedList coolList = new LinkedList();
		//System.out.println(coolList.deletion());
		coolList.insert("Dank Meme", "Dat Boi");
		coolList.insert("Subpar Meme", "Spongegar");
		coolList.insert("Bad Meme", "Cash me ousside");
		coolList.display();
		System.out.println("----");
		coolList.deletion();
		coolList.display();
		System.out.println("----");
		System.out.println(coolList.search("Dank Meme").key);
	}
}
