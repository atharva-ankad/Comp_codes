import java.util.*;
public class Some_sum
{
    public static Scanner sc= new Scanner (System.in);
    public static void main (String args [])
    {
        System.out.println("Enter N,A,B respectively");
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=0;
        int sd=0;
        int copy;
        for(int i=1;i<=n;i++)
        {
            copy=i;
            sd=0;
            while(copy>0)
            {
                d=copy%10;
                copy=copy/10;
                sd=sd+d;
            }
            if (sd>=a && sd<=b)
            {
                System.out.println(i);
            }
        }
    }
}