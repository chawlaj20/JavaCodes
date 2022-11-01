package Collections_codes;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linked_Hashset2 {

	public static void main(String[] args) {
		ArrayList<Integer> obj =new ArrayList<>();
		//using add method
		obj.add(56);
		obj.add(78);
		obj.add(6);
		System.out.println("Array list is:"+obj);
		//creating hashset from an array list
		LinkedHashSet<Integer> obj2=new LinkedHashSet(obj);
		
		System.out.println("Linkedhashset is:"+obj2);

	}

}
