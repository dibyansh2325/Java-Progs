import java.util.Scanner;
public class patt {
    public void sum()
    {
        int sum =0;
        int ctr =0;
        for(int i=2; i<=20;i++)
        {
           ctr++;
           if(ctr%2==0)
           {
               sum = sum -i;
           }
           else 
           {
               sum = sum +i;
           }
          
        }
        System.out.println("Sum = "+sum);
    }
    public void sum(int x)
    {
        double p;
        double sum = 0.0;
        for(int i =2; i<=20;i=i+3)
        {
            p = x/i;
            sum = sum + p;
           
        }
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        patt obj = new patt();
        obj.sum();
        obj.sum(x);
        sc.close();
    }
    
}
