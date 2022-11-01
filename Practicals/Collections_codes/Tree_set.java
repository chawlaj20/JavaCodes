/* tree set class implements set interface that uses a tree for storage
 * it inherits abstract sets class an implements navigable set interface 
 * the objects of the tree set class are stored in ascending order .it contains unique elements and does not allows null values
 * 
 */
package Collections_codes;

import java.util.*;

public class Tree_set {

	public static void main(String[] args) {
		
	    SortedSet<String> fruits=new TreeSet<>();
	    
	    fruits.add("apple");
	    fruits.add("mango");
	    fruits.add("banana");
	    fruits.add("grapes");
	    
	    System.out.println("Fruits are:"+fruits);
	    //duplicates elements  are ignored
	    fruits.add("Apple");
	    System.out.println("after adding duplicates elements:"+fruits);
	    
		

	}

}
