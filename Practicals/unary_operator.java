package Operators_ex;

import java.util.Scanner;

public class unary_operator {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		
       // performing pre increment operation
		++n1;
		System.out.println("preincrement value:"+n1);
		
		// performing post increment
		n1++;
		System.out.println("post increment:"+n1);
		
		//performing pre decrement
		--n1;
		System.out.println("pre decrement:"+n1);
		
		//performing post decrement
		n1--;
		System.out.println("post decrement:"+n1);
		

	}

}
