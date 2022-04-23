import java.util.Scanner;
public class prime2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to begin");
        int n = sc.nextInt();
        sc.close();
 
        int ctr = 0;
       

        do{
            int flag =0;
            for(int i = 1;i <= n; i++)
            {
                if(n%i==0)
                {
                    flag++;
                }
            }
            if(flag==2)
            {
                ++ctr;
                System.out.println(ctr+" : "+n);
               
            }
            n++;
        }
        while(ctr<50);
    }
    
}
