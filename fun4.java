import java.util.*;
public class fun4 { 
    public int sum(int a,int b)
    {
        int s = a+b;
        return s;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int m = sc.nextInt();
    int n = sc.nextInt();
    sc.close();
    fun4 obj = new fun4();
    int x = obj.sum(m,n);
    System.out.println("Sum = "+x);
}

    
}
