import java.util.*;
public class formatstring{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        String a=S.next();
        String b=String.format("congratulations %s you won 5 lakhs",a);
        System.out.println(b);

    }
}