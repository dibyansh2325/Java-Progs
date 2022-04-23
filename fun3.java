import java.util.Scanner;
public class fun3 {
    public int sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int s = x+y;
        sc.close();
        return s;
        
    }
    public static void main(String[] args) {
        fun3 obj = new fun3();
        int a = obj.sum();
        System.out.println("Sum = "+a);

    }

    
}
