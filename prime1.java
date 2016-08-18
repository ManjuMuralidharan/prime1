import java.util.*;

class prime1
{
	public static void main(String[] args)
	{
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int count=0;
	   
	   for(int i=2;i<=n;i++)
	   {
		   if(n%i==0)
		   {
			   count++;
		   }
	   }
	   
	   if(count==1)
	   {
		   System.out.println("prime");
	   }
	}
}