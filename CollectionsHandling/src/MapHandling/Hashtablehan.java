package MapHandling;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
public class Hashtablehan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> a = new Hashtable<String,String>();//Collections.reverseOrder()
		a.put("Name", "Nivash");
		a.put("Town", "chennai");
		a.put("State", "TN");
		//a.put("Pin", null);
		Set<?> b = a.entrySet();
		Iterator<?> C = b.iterator();
		while(C.hasNext()) {
		System.out.println(C.next());			
		}

	}

}
