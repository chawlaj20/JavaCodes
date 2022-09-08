class PrimeNumber
{

	static boolean isPrime(int num)
		{
		   if(num<=1)
			{
 		   	   return false;
			}	
		        for(int i=2;i<=num/2;i++)
			{
			    if(num%i==0)
				return false;
			
			}
                  return true;	
		}


	 public static void main (String[]args)
	 {
	    java.util.Scanner sc=new java.util.Scanner(System.in);

     	    System.out.print("Enter a number to check is prime or not:");

 	    int num=sc.nextInt();

	    if(isPrime(num))
             {
		System.out.println(num + " is Prime Number");
	     }
	    else
              {
	       	System.out.println(num +" is not a Prime Number");
	      }
	 }
		

		
}
                 