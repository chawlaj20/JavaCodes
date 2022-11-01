package Operators_ex;

import java.util.Scanner;

public class Arirhmetic_operator {

	public static void main(String[] args) {
		//create scanner class obj to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd number:");
		int n2=sc.nextInt();
		sc.close();
		
		// writing operations
		int add,sub,mul,mod;
		double div;
		add=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		mod=n1%n2;
		div=n1/n2;
		
		//printing values
		System.out.println("Addition is:"+add);
		System.out.println("subtraction is:"+sub);
		System.out.println("multiplication is:"+mul);
		System.out.println("modulus:"+mod);
		System.out.println("division:"+div);
		

	}

}
