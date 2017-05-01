package hashmaps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
public class Main {
	public static HashMap<Integer, String> map;
	public static HashSet<String> map2;
	
	public static void main(String[] args){
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		Integer[] arr = {3,4,5,6,8};
		int a=3;
		int b=8;
		for(int i=0;i<arr.length;i++){
			table.put(i,arr[i]);
		}
		for(int j=a;j<=b;j++){
			if(!table.contains(j))
				System.out.println(j);
		}
		
	}
}
