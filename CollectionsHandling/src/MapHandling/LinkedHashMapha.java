package MapHandling;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashMapha {	//O/p is insertion proper order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,String> a = new LinkedHashMap<String,String>();
		a.put("name", "Nivash");
		a.put("city", "chennai");
		a.put("State", "TN");
		Set<?> b = a.entrySet();
		Iterator<?> C = b.iterator();
		while(C.hasNext()) {
		System.out.println(C.next());			
		}
	}

	}

