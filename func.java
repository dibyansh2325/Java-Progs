import java.util.Scanner;
public class func {
    public void cal()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum = "+ (x+y));
        sc.close();

    }
    public static void main(String[] args) {
        func obj = new func();
        obj.cal();
        
    }


    
}
