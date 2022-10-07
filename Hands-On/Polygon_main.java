package Encapsulation;

import java.util.Scanner;

public class Polygon_main {

	public static void main(String[] args) {
                 
		// get input from user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length:");
		int l=sc.nextInt();
		
		System.out.println("Enter breadth");
		int b=sc.nextInt();
		
		//create object of class
		Rectangle r1=new Rectangle();
		r1.getArea(l, b);
		

}
}
