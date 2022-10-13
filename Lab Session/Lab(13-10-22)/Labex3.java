/*write a program to print sum of 10  natural number using while loop.
 * name:jyoti chawla
 * date:13/10/22
 */

package Lab13;

import java.util.Scanner;

public class Labex3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");//get input from user in these upto which no we have print sum of numbers.
		int num=sc.nextInt();
	    int i=1;
	    int sum=0;
		
		while(i<=num)  //condition 
		{ 
			sum=sum+i;//for sum of numbers
			i++;//increment
		
		}
		System.out.println("sum of "+num+" natural numbers:"+sum); //print sum of natural numbers
		

	}

}
