/*Write a java program to compare two sets and retain elements which are same on both sets.(use retainall() method))
 * Name:Jyoti chawla
 * lab date:3/10/22
 */
package Lab3_10;

import java.util.HashSet;

public class Set_Compare {

	public static void main(String[] args) {
		//creating First set 
		HashSet<String>Obj1=new HashSet<>(); 
		//using add() method
		Obj1.add("karan");
		Obj1.add("Jyoti");
		Obj1.add("shruti");
		Obj1.add("Bunny");
		Obj1.add("Nilu");
		
		System.out.println("First Hashset is:"+Obj1);

		//creating second set
		HashSet<String>Obj2=new HashSet<>(); 
		//using add() method
		Obj2.add("Jyoti");
		Obj2.add("shruti");
		Obj2.add("Bunny");
		Obj2.add("teddy");
		
		System.out.println("Second Hashset is:"+Obj2);
		
		//print same elements in both sets using retainall() method
		Obj1.retainAll(Obj2);
		System.out.println("Same Elements are:"+Obj1);

	}

}
