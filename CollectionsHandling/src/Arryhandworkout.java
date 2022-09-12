import java.util.ArrayList;
import java.util.Iterator;
public class Arryhandworkout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 ArrayList <Integer> a = new ArrayList <Integer>();
				 a.add(2);
				 a.add(4);
				 a.add(6);
				 a.add(8);
				 System.out.println(a.get(0));
				 System.out.println(a.get(1));
				 System.out.println(a.get(2));
				 System.out.println(a.get(3));
				 //System.out.println(a.remove(1));
				 System.out.println(a.addAll(a));
				 System.out.println(a.size());
				 Iterator<Integer> b = a.iterator();
				 while(b.hasNext()) {
					 System.out.println(b.next());
				 }
			}	
}		
