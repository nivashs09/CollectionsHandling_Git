import java.util.ArrayList;
import java.util.Iterator;

public class ArrayHandling {
          //Implements RESIZEABLE ARCHITECTURE
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);   //stored autom in index 0,1,2,3
		a.add(20);
		a.add(30);
		//a.add("Kolkatta");
		//a.add("Kerala");	//stored autom in index 4
		//a.add("Goa");
		//a.add(12);
		//a.add(18);
		//System.out.println(a.get(1));  // call the index value
		//System.out.println(a.size());
		//for (int i=0;i<a.size();i++) {
			//System.out.println(a.get(i));
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(100);
		c.add(200);
		c.add(300);
		c.remove(1); // resize
		c.addAll(a);
		System.out.println(c.size());
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		
		Iterator<Integer> b = c.iterator();
		while(b.hasNext()) {
		System.out.println(b.next());
		}
			}
}
