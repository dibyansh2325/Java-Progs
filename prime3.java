public class prime3 {
    public static void main(String[] args) {
        
        
        for(int i = 10; i<=1000; i++)
        {
            int ctr=0;
            for(int j = 1; j<=i;j++)
            {
                if(i%j==0)
                {
                    ctr++;
                }
            }
            if(ctr==2)
            {
                System.out.println(i);
            }
        }
    }
    
}
