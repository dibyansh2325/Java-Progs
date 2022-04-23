import java.util.Scanner;
public class specialOrpalindrone {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER A STRING");
    String s = sc.next();
    s = s.trim();
    sc.close();

    char c1 = s.charAt(0);
    String ch = "";
    ch = ch+c1;
    boolean b = s.endsWith(ch);
    if(b==true)
    {
        System.out.println("Special Word");
    }
    else{
        System.out.println("Not Special Word");
        System.exit(0);
    }

    int l = s.length();
    String rev = "";
    char r;
    for(int i=l-1;i>=0;i--)
    {
        r = s.charAt(i);
        rev = rev+r;
    }

    if(s.equals(rev)==true)
    {
        System.out.println("Palindrone");
    }
    else
    {
        System.out.println("Not Palindrone");
    }





}
    
}
