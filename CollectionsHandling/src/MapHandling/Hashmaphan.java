package MapHandling;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Hashmaphan {   //O/p is Random order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String,String> a = new HashMap<String,String>();
		HashMap<String,Integer> a = new HashMap<String,Integer>();
		a.put("name", 1);
		a.put("city", 2);
		a.put("State", 3);
		System.out.println(a.get("name"));
		Set b = a.entrySet();
		Iterator C = b.iterator();
		while(C.hasNext()) {
		System.out.println(C.next());	
		
		}
	}
}
