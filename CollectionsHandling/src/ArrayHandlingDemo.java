import java.util.ArrayList;
import java.util.Iterator;
public class ArrayHandlingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList <Integer> a = new ArrayList <Integer>();
		//a.add(10);
		//a.add(20);
		//a.add(30);
		//a.add(40);
		//a.remove(0);
		//System.out.println(a.get(0));
		//System.out.println(a.size());
		//System.out.println(a.addAll(a));
		ArrayList <String> b = new ArrayList <String>();
		b.add("kolkatta");
		b.add("lonawala");
		b.add("delhi");
		b.add("chennai");
		System.out.println(b.get(0));
		System.out.println(b.get(1));
		System.out.println(b.get(2));
		System.out.println(b.size());
		Iterator<String> d = b.iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		}
}

