import java.util.*;
public class Roman_to_Integer 
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args [])
    {
        System.out.println("Enter roman number");
        String s=sc.next();
        int num= romanToInt(s);
        System.out.println("Converted to Integer: "+num);
    }
    public static int val(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String s) 
    {
        s=s.toUpperCase();
        int num=val(s.charAt(s.length()-1));
        for (int i=s.length()-1;i>0;i--)
        {
            if(val(s.charAt(i-1))>=val(s.charAt(i)))
                num=num+val(s.charAt(i-1));
            else
                num=num-val(s.charAt(i-1));
        }
        return num;
    }
}
