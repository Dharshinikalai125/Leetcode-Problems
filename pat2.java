//Pattern 2
import java.util.*;
public class pat2{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
        int n=sc.nextInt();
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

Output:

D:\Patterns>javac pat2.java

D:\Patterns>java pat2
5

* * * * * *
* * * * *
* * * *
* * *
* *
*