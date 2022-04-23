public class primepalindrone {
    public static void main(String[] args) {
        
        for(int i = 10; i<=1000; i++)

        {
            int ctr =0;int n=0,r=0,sum=0;
            for(int j = 1; j<=i;j++)
            {
                if(i%j==0)
                {
                    ctr ++;
                }
                
            }
            if(ctr==2)
            {
                n=i;
                while(n!=0)
                {
                    r=n%10;
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(sum==i)
                {
                    System.out.println(i);
                }
            }
        }
    }
    
}
