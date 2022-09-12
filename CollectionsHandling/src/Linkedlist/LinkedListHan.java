package Linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListHan {
	
	public static void main(String[] args) {
		//Implements double link ARCHITECTURE
LinkedList<Integer> a=new LinkedList<Integer>();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
a.add(50);
System.out.println(a.get(0));
System.out.println(a.get(1));
System.out.println(a.get(2));
System.out.println(a.get(3));
System.out.println(a.size());

Iterator<Integer> b=a.iterator();
while(b.hasNext()) {
	System.out.println(b.next());
}
}
}
