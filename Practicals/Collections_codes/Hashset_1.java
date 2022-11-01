package Collections_codes;

import java.util.HashSet;
import java.util.Iterator;

class Hashset_1 {

	public static void main(String[] args) {
		
		HashSet<String> obj1=new HashSet<>();    
		//using add method()
		
		obj1.add("jyoti");
		obj1.add("shruti");
		obj1.add("joy");
		
		System.out.println("Hashset is:"+obj1);
		//calling iterator() method
		Iterator<String> obj2=obj1.iterator();
		System.out.println("hashset using iterator:");
		while(obj2.hasNext())// hasnext() is method to check next value in array
		{
			System.out.print(obj2.next());
			
			System.out.print(",");
		}
		
           
	}

}
