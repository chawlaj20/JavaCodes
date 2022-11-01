package Operators_ex;

import java.util.Scanner;

public class bitwise_operator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();

		System.out.println("Enter 2nd number:");
		int n2=sc.nextInt();
		
		//bitwise AND opertor
		System.out.println("n1&n2="+(n1 & n2));
		//0 1 0 1
		//0 1 1 0
		//--------
		//0 1 0 0=4
		
		//bitwise or operator
		System.out.println("n1 | n2="+(n1 | n2));
		//0 1 0 1
		//0 1 1 0
		//-------
		//0 1 1 1=7
		
		//bitwise XOR operator
		System.out.println("n1 ^ n2="+(n1^ n2));
		//0 1 0 1
		//0 1 1 0
		//-------
		//0 0 1 1=3
		
	}

}
