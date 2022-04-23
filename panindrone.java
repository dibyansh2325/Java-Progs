import java.util.Scanner;
public class panindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        sc.close();
        int m = n;
        int r;
        int sum =0;

        while(m!=0)
        {
            r = m%10;
            sum = (sum*10)+r;
            m = m/10;
        }

        if(sum == n)
        {
            System.out.println("Palindrone Number");

        }
        else{
            System.out.println("Not Palindrone");
        }
    }
    
}
