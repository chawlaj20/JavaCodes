/*create a program for calculation.read three values from the user for operation first and second values are operands. third value is operator.
 * if user press1=>print addition of first and second ,if user press2=>print substraction of first and second,if user press3=>print multiplication of first and second
 * if user press4=>print division of first and second 
 * Name:Jyoti
 * labDate : 6-10-22
 */

package Lab6;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// creating variables
		int add;
		int sub;
		int mul;
		int div;
		
		Scanner sc=new Scanner(System.in);  //import scanner class
		
		System.out.println(" 1 - Add two number ");   
		System.out.println(" 2 - Sub two number ");      
		System.out.println(" 3 - Mul two number ");
		System.out.println(" 4 - Div two number ");
		int choice=sc.nextInt();                   // choice for user i.e addition,subtraction,multiplication,division
		
		System.out.println("Enter any two Number: ");  // get two number for user
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		switch(choice)    // using switch case
		{
		case 1: // condition 1
			add=n1+n2;
			System.out.println("addition of two number: "+add); 
			break;
			   
		case 2:  // condition 2
			sub=n1-n2;
			System.out.println("subtraction of two number: "+sub);
			break;
		
		case 3: // condition 3
			mul=n1*n2;
			System.out.println("Multiplication of two number:"+mul);
			break;
			
		case 4:  // condition 4
			div=n1/n2;
			System.out.println("division of two number:"+div);
			break;
	
		}
		
		
}

}
