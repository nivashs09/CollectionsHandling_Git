package MapHandling;
//import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class Treemaphan {   //O/p is in Ascending insertion proper order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> a = new TreeMap<String,String>();//Collections.reverseOrder()
		a.put("Name", "Nivash");
		a.put("Town", "chennai");
		a.put("State", "TN");
		a.put("Pin", null);
		Set<?> b = a.entrySet();
		Iterator<?> C = b.iterator();
		while(C.hasNext()) {
		System.out.println(C.next());			
		}
	}
	}

