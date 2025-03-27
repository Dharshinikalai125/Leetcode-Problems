//Happy number(202)
import java.util.*;
public class Happyno 
{
	public static void main(String args[])
	{
           Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   while(n>9)
           {
           	int sum=0;
            	while(n!=0)
            	{
                   int rem=n%10;
                   sum=sum+(rem*rem);
                   n=n/10;
            	}
            	n=sum;
       	  }
          if(n==1||n==7)
          {
          	System.out.print("true");
          }
       	  else
       	  {
           	System.out.print("false");
       	  }
    	}
}