import java.util.*;
public class lenoflastword
{
   	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
      		int n=s.length();
		int count=0;
		for(int i=n-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
			else
			{
				break;
			}
		}
		System.out.print(count);
	}
}