//program to demonstrate (do-while)and print the reverse counting from the user input number. 
package Operators_ex;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		
		//declare the variables
		int reverse=0;
		int original;
		
		do 
		{
			original=num%10;   //find remainder of each num and store in original
			reverse=reverse*10+original;   // store in reverse
			num=num/10;       //divide number by 10         
			
		}
	   while(num!=0);
		System.out.println("Reverse number:"+reverse);   
		
	}

}
