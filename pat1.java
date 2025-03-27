//Pattern 1
import java.util.*;
public class pat1
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
     }
} 

Output:

D:\Patterns>javac pat1.java

D:\Patterns>java pat1
5

*
* *
* * *
* * * *
* * * * *
