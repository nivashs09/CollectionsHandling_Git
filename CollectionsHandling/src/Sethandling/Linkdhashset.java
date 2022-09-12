package Sethandling;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Linkdhashset {      //SAME INSERTION ORDER O/p and Unique value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> a = new LinkedHashSet <Integer>();
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
		 //System.out.println(a.addAll(a));
		 System.out.println(a.size());
		 Iterator<Integer> b = a.iterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());
	}
	}
}
