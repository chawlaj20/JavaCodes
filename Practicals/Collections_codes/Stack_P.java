package Collections_codes;

import java.util.Stack;

public class Stack_P {

	public static void main(String[] args) {
		
		Stack<String> obj1=new Stack<>();
		obj1.push("jyoti");
		obj1.push("shruti");
		obj1.push("adesh");
		obj1.push("vikas");
		
		System.out.println("Stack value: "+obj1);
		
		//pop elements from the top
		obj1.pop();
		System.out.println("Stack after pop:"+obj1);
		
	}

}
