package Operators_ex;

import java.util.Scanner;

public class Logical_Operator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd Number:");
		int n2=sc.nextInt();
		
		System.out.println("Enter 3rd Number:");
		int n3=sc.nextInt();
		System.out.println("performing AND operation");
		//using logical and to verify 2 constraint
		if((n1<n2) &&(n2==n3))
		{
			int sum=n1+n2+n3;
			System.out.println("sum is:"+sum);
		}
		else
		{
			System.out.println("false condition");
		}
		
		System.out.println("performing or operation:");
		
		//using logical or to verify 2 constraint
		if((n1<n2)||(n1==n3))
		{
			int sum=n1+n2+n3;
			System.out.println("Sum is:"+sum);
		}
		else
		{
			System.out.println("false condition");
		}
		
		System.out.println("Performing NOT operation");
		
		System.out.println("!(n1<n2)"+!(n1<n2));
		System.out.println("!(n2==n3)"+!(n2==n3));

	}

}
