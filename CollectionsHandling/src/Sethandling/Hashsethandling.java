package Sethandling;
import java.util.HashSet;
import java.util.Iterator;
public class Hashsethandling {    //RANDOM ORDER O/p and Unique value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Integer> a = new HashSet <Integer>();
		 a.add(10);
		 a.add(10);
		 a.add(20);
		 a.add(20);
		 a.add(30);
		 a.add(30);
		 //System.out.println(a.get(0));
		 //System.out.println(a.get(1));
		 //System.out.println(a.get(2));
		 //System.out.println(a.remove(1));
		 System.out.println(a.addAll(a));
		 System.out.println(a.size());
		 Iterator<Integer> b = a.iterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());

	}
	}
}
	
