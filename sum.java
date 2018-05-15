public class Sum
{
	public static void main(String args[])
	{
	  int first=0;
	  int second=1;
	  int sum=0;int i=0;
	   System.out.println(first);
	   System.out.println(second);
		while(i<7)
		{
		   sum=first+second;
		   first=second;
		   second=sum;
		  System.out.println(sum);
		i++;
		} 
	}	
}
