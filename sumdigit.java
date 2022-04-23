import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        sc.close();

        int r = 0;
        int sum = 0;
        int m = n;

        while(m!=0)
        {
            r=m%10;
            sum = sum+r;
            m=m/10;
        }

        System.out.println("Sum of Digits = "+sum);
;    }
}
