public class nonzero {
    public static void main(String[] args) {
        
       

        for(int i = 100; i<=200; i++)
        {
            int r,n,ctr=0;
            n=i;
            while(n!=0)
            {
                r=n%10;
                if(r==0)
                {
                    ctr++;
                }
                n=n/10;

            }
            if(ctr==0)
            {
                System.out.println(i);
            }
        }
    }

    
}
