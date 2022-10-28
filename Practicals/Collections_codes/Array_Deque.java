package Collections_codes;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
		ArrayDeque<String> obj1 = new ArrayDeque<>();
		
		obj1.add("jyoti");
		obj1.add("shruti");
		
		//using addFirst() method
		obj1.addFirst("Adesh");
		
		//using addLast() method
		obj1.addLast("Bhakti");
		obj1.addLast("vikas");
		System.out.println("Array Deque: " + obj1);

     }
}