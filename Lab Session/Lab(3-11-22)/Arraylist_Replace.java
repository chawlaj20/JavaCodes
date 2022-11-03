/*Write a java program to replace the second element of a Arraylist with the specified element
 * Name:Jyoti chawla
 * lab date:3/10/22
 */

package Lab3_10;

import java.util.ArrayList;

public class Arraylist_Replace {

	public static void main(String[] args) {
		//creating array list of names
		ArrayList<String> names=new ArrayList<>();
		//using add() method
		names.add("jyoti");
		names.add("john");
		names.add("shruti");
		names.add("sam");
		
		System.out.println("Arraylist are:"+names);
		
		//replace 2nd element shruti and set rani value
		names.set(2, "Rani");
		System.out.println("New Array list is:"+names);
	}

}
