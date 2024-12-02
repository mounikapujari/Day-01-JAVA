import java.util.*;
public class Name
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        String a=S.next();
        int b=S.nextInt();
        String c=String.format("the name of the person is %s and age is %d",a,b);
        System.out.println(c);
    }
}