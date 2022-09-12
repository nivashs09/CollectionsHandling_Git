package Sethandling;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class Treesethan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a = new TreeSet <Integer>(Collections.reverseOrder());//Collections.reverseOrder()
		 a.add(40);
		 a.add(50);
		 a.add(10);
		 a.add(20);
		 a.add(30);
		 //System.out.println(a.get(0));
		 //System.out.println(a.get(1));
		 //System.out.println(a.get(2));
		 //System.out.println(a.remove(1));
		 //System.out.println(a.addAll(a));
		 //for(int i=0; i<a.size();i++) {
			// System.out.println(a.get());
		 		 //System.out.println(a.size());
		 Iterator<Integer> b = a.iterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());
		 }
	}
}