import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        float tv, pv, x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Total Number of Voters");
        tv = sc.nextInt();
        sc.close();

        pv = (80.f/100) * tv;

        x = (60.f/100) * pv;
        y = pv - x;

        System.out.println("Present Voters : " + pv);
        System.out.println("Vote of X : " + x);
        System.out.println("Votes of Y : " + y);


    }
    
}
