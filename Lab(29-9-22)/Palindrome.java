package Lab29;

import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
		
		String s,value="";
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string to check is Palindrome or not :");
		s=sc.nextLine();
		
		int length=s.length();
		
		for(int i=length-1; i>=0 ;i--)
		
			value=value+s.charAt(i);
		
			
		if(s.equals(value))
			System.out.println("String is palindrome.");
		
		else
			System.out.println("string is not a palindrome.");
	}

}
