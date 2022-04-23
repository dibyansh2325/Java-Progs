import java.util.Scanner;
public class fac {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term");
        int n = sc.nextInt();
        sc.close();

        int f=1;
        double d =0.f;
        double sum = 0;

        for(int i = 1;i<=n;i++)
        {
            for(int j = 1; j<=i; j++)
            {
                f = f*j;
                d = (double)1/f;
            }
            sum=sum+d;

        }

        System.out.println("Sum = "+sum);
    }
    
}
