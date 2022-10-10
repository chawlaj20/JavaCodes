package Operators_ex;

import java.util.Scanner;

public class Assignment_operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
				
	    System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		
		n1+=n2;
		System.out.println("n1=:"+n1);
		n1-=n2;
		System.out.println("n1=:"+n1);
		n1*=n2;
		System.out.println("n1=:"+n1);
		n1/=n2;
		System.out.println("n1=:"+n1);
		n1%=n2;
		System.out.println("n1=:"+n1);
	}

}
