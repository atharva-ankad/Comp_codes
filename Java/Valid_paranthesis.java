import java.util.*;
public class Valid_paranthesis
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the string to be checked: ");
        //String s="[][][]";
        String s=sc.next();
        if(isValid(s))
        {
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");
    }
    public static boolean isValid(String s)
    {
        char ch;
        Deque<Character> stack = new ArrayDeque<>();
        int a=0, b=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            ch=s.charAt(i);
            switch(ch)
            {
                case ')':
                case ']':
                case '}':
                    stack.push(ch);
                    a++;
                    break;
                case '(':
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek()==')')
                        stack.pop();
                        b++;
                    break;
                case '[':
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek()==']')
                        stack.pop();
                        b++;
                    break;
                case '{':
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek()=='}')
                        stack.pop();
                        b++;
                    break;
            }
        }
        boolean check=stack.isEmpty();
        if(check==true && a==b)
            return true;
        else
            return false;
    }
}
