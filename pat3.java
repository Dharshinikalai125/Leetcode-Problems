import java.util.*;
public class pat3
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
	for(int i=n+1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

     }
} 

/*Output:
D:\Patterns>javac pat3.java

D:\Patterns>java pat3
Enter n:
5

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/
