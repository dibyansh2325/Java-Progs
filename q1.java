import java.util.Scanner;
public class q1
{
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double d =0.0;
        double s = 0.0;
        for(int i = 1; i<=n; i++)
        {
            d = i/Math.pow((i+1),2);
            s = s+d;
        }
        sc.close();
        
    }
}