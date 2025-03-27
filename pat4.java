//Pattern 4
import java.util.*;
public class pat4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*Output:

D:\Patterns>javac pat4.java

D:\Patterns>java pat4
5
    *
   * *
  * * *
 * * * *
* * * * *   */