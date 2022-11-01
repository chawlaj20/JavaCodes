package Operators_ex;

import java.util.Scanner;

public class Relational_operator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd number:");
		int n2=sc.nextInt();
		sc.close();
		
		//performing equal to operator
		System.out.println("num1==num2:"+(n1==n2));
		
		//performing is not equal to operator
		System.out.println("num1!num2:"+(n1!=n2));
		
		//performing greater than operator
		System.out.println("num1>num2:"+(n1>n2));
		
		// performing less than operator
		System.out.println("num1<num2:"+(n1<n2));
		
		// performing lessthan equal to operator
		System.out.println("num1<=num2:"+(n1<=n2));
		
		// performing greater than equalto operator
		System.out.println("num1>=num2:"+(n1>=n2));
		
		
		
	}

}
