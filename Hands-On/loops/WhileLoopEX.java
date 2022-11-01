//program to demonstrate while loop continues until entered number is positive.
package Operators_ex;

import java.util.Scanner;

public class WhileLoopEX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		
		while(num>0)
		{
			System.out.println("The number is positive...");
			num++;
			break;
		}
	
	}

}
