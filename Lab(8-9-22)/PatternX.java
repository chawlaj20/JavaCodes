class PatternX
{
	public static void main (String[] args)
	{
	   int i , j , k , n;
	   
	   n=4;
		
           k= n*2-1;
           
	   for(i=1;i<=k;i++)
		{
		   for(j=1;j<=k;j++)
		    {
			if(j==i || j==k-i+1)
			
			System.out.print("*");
			System.out.print(" ");
		     }
 			System.out.println();
		}
	  
	 }
}