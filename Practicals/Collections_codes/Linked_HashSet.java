// Linked Hashset is an ordered and sorted collection and it maintain the insertion order of the elements
package Collections_codes;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> obj1=new LinkedHashSet<>();
		//using add method()
		
		obj1.add("jyoti");
		obj1.add("perl");
		obj1.add("joy");
		
		System.out.println("LinkedHashset is:"+obj1);
		//calling iterator() method
		System.out.println("LinkedHashset using iterator:");
		Iterator<String>obj2=obj1.iterator();
		while(obj2.hasNext()) {
		
		System.out.print(obj2.next());
		
		System.out.print(",");
		}
	}

}
