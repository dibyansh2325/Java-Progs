import java.util.Scanner;
public class primepalindrone2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int ctr =0;
        sc.close();

        for(int i =1; i<=n;i++)
        {
            if(n%i==0)
            {
                ctr++;
            }
        }
        if(ctr==2)
        {
            int r = 0;
            int num = 0;
            int m = n;

            while(m!=0)
            {
                r=m%10;
                num = (num*10)+r;
                m=m/10;
            }
            if(num==n)
            {
                System.out.println("Prime Palindrome");
            }
            else{
                System.out.println("Not a Prime Palindrone");
            }
        
        }
    }
    
}
