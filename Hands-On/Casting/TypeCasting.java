package Casting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=sc.nextInt();
		
		
		long l=i;   //no explicit type casting required
		float f=l;  ///no explicit type casting required
		
		System.out.println("int value is:"+i);
		System.out.println("long value is:"+l);
		System.out.println("float value is:"+f);

	}

}
