/*Write a java program to check if a particular element exists in a linked list.
 * Name:Jyoti chawla
 * lab date:3/10/22
 */

package Lab3_10;

import java.util.LinkedList;

public class Linkedlist_Exists {

	public static void main(String[] args) {
		// Create a linked list 
		LinkedList<String>obj=new LinkedList<>();
		
		//using add() method
		obj.add("java");
		obj.add("python");
		obj.add("C++");
		obj.add("C#");
		obj.add("Sql");
		
		System.out.println("LinkedList are:"+obj);

		//checked particular element exists or not
		if(obj.contains("C++")) //using conatins()method
		{
			System.out.println("Element present in linkedlist");
		}
		else
		{
			System.out.println("Element not present in linkedlist");
		}
	}

}
