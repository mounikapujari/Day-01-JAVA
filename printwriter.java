import java.io.PrintWriter;
public class printwriter{
    public static void main(String args[]){
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("hello,World!");
        pw.print("This ia a ");
        pw.print("print statement");
        pw.close();

    }
}