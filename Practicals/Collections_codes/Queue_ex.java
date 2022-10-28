package Collections_codes;

import java.util.LinkedList;
import java.util.Queue;


public class Queue_ex {

	public static void main(String[] args) {
		//using linkedList class to create queue.	
		Queue<Integer> obj1=new LinkedList<>();
		
		//offer elements to the queue
		obj1.offer(33);
		obj1.offer(22);
		obj1.offer(6);
		obj1.offer(90);
		System.out.println("Queue is:"+obj1);
		
		//access elements of the queue using peek()method
		int i=obj1.peek();
		System.out.println("access element:"+i);
		
		//remove element from the queue using poll() method
		int j=obj1.poll();
		System.out.println("removed element:"+j);
		
		System.out.println("the updated queue is:"+obj1);
		

	}

}
