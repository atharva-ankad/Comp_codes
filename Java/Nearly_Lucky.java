import java.util.*;
public class Nearly_Lucky {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String num=sc.next();
        int d=0, c=0;
        for(int i=0;i<num.length();i++)
        {
            d=num.charAt(i);
            if(d=='4' || d=='7')
                c++;
        }
        if (c==4 || c==7)
            System.out.println("YES");
        else
                System.out.print("NO");
    }
}
