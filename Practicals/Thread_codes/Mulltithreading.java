package Thread_codes;

public class Mulltithreading implements Runnable {

	public static void main(String[] args) {
		
		Thread Multithreading=new Thread("Demo1");
		Thread Multithreading2=new Thread("Demo2");
		
		Multithreading.start();
		Multithreading2.start();
		
		System.out.println("Thread names are following:");
	    System.out.println(Multithreading.getName());
	    System.out.println(Multithreading2.getName());
	}
	
	public void run()
	{
		
	}

}
