/*Write a java program to change priority queue to maximum priorityqueue .(use any loop)
 *Name:Jyoti chawla
 *lab date:3/10/22
 */


package Lab3_10;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_QueueMax {

	public static void main(String[] args) {
		
		//creating priority queue 
	
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		// using offer() method
		queue.offer(4);
		queue.offer(6);
		queue.offer(90);
		queue.offer(23);
		queue.offer(34);
		queue.offer(9);
		queue.offer(12);
		queue.offer(66);
		queue.offer(72);
		queue.offer(0);

		System.out.println("Original PriorityQueue list are:"+queue);
		
		System.out.print("Maximum Priority queue list:");
		
		Integer value=null;
		
		    System.out.print("[");
		    // using while loop
			while((value = queue.poll())!= null) {
		    System.out.print(value+"  ");
			}
			System.out.print("]");
			
	}
		
}


