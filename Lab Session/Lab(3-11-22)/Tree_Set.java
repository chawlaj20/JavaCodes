/*Write a java program to get element in a tree set which is strictly greater than or equal to the given element.
 * Name:Jyoti chawla
 * lab date:3/10/22
 */

package Lab3_10;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		//create a tree set
		TreeSet<Integer> numbers=new TreeSet<>();
		//using add method
		numbers.add(45);
		numbers.add(78);
		numbers.add(55);
		numbers.add(2);
		numbers.add(25);
		numbers.add(67);
		
		System.out.println("Treeset elements are:"+numbers);
		
		//use ceiling() method to check whether given num is grater or equal to this number
		System.out.println("Number which is grater or equal to 23:"+numbers.ceiling(23));
		
		System.out.println("Number which is grater or equal to 2:"+numbers.ceiling(2));
		
		System.out.println("Number which is grater or equal to 80:"+numbers.ceiling(80));

	}

}
