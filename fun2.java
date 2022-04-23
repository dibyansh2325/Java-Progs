import java.util.Scanner;
public class fun2 {
       public void cal(int x, int y)
    {
       
        System.out.println("sum = "+ (x+y));
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        fun2 obj = new fun2();
        obj.cal(a,b);
        sc.close();
        
    }


    
}


