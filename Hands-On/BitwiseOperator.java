package Operators_ex;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=sc.nextInt();

		System.out.println("Enter 2nd number:");
		int num2=sc.nextInt();

		System.out.println("Enter 3rd number:");
		int num3=sc.nextInt();
		
		//Bitwise AND operator
		System.out.println("BitwiseAND operator:");
		System.out.println("num1&num2:"+(num1 & num2)+"  "+"num2&num3:"+(num2 & num3));
		// 0 1 0 1                 0 1 1 0
		// 0 1 1 0                 0 1 0 0
		//---------                --------
		// 0 1 0 0=4               0 1 0 0= 4
		
		//Bitwise OR operator
		System.out.println("Bitwise OR operator");
		System.out.println("num1|num2:"+(num1 | num2)+"  "+"num2|num3:"+(num2 | num3));
		//0 1 0 1                0 1 1 0
		//0 1 1 0                0 1 0 0
		//----------            ----------
		// 0 1 1 1=7             0 1 1 0=6
	   
		//Bitwise XOR operator
		System.out.println("Bitwise XOR operator");
		System.out.println("num1^num2:"+(num1 ^ num2)+"  "+"num2^num3:"+(num2 ^num3));
		//0 1 0 1                      0 1 1 0
		//0 1 1 0                      0 1 0 0
		//---------                   ----------
		//0 0 1 1=3                    0 0 1 0=2
		
	}

}
