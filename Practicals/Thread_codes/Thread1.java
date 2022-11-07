package Thread_codes;

public class Thread1 extends Thread{
	
	public static int amount=0;

	public static void main(String[] args) {
		
		Thread1 te=new Thread1();
		te.start();
		
		System.out.println(amount); 
		amount++;   
		
		System.out.println(amount);

		}
		public void run()
		{
		amount++; 
		}
		

	}


