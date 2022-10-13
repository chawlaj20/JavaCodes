/*Write a program to print sum of only positive numbers using do-while loop .take the input from user.if the user enters any negative numbers then that number should not 
 * be added in sum.
 * name:jyoti chawla
 * date:13/10/22
 */
package Lab13;

import java.util.Scanner;

public class LabEx4 {

	public static void main(String[] args) {
		int sum = 0;
	    int num = 0;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);
		   
	    // do...while loop continues 
	    // until entered number is positive
	    do {
	      // add only positive numbers
	      sum += num;
	      System.out.println("Enter a number");
	      num = input.nextInt();
	    } 
	    while(num >= 0); 
	     System.out.println("Sum = " + sum);
	    input.close();
	}
}
