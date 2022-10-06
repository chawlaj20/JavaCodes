
/* Create a program to find largest of two numbers
 * Name:Jyoti
 * LabDate:6-10-22
 */
package Lab6;

import java.util.Scanner; //import scanner class

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);          //get number from user
		System.out.println("Enter a first number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter a second number:");//get number from user
		int n2=sc.nextInt();
		
		System.out.println("Largest number between 1st and 2nd is: ");
		
		//use if else loop and check which no is largest
		
		if(n1>n2)//give a conditon
		{
			System.out.println(n1+" is largest number");//if condition is true then print this
		}
		else
		{
			System.out.println(n2 + " is largest number"); //if condition if false then print this
		}
		
		

	}

}
