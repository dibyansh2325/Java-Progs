public class perfect100 {
    public static void main(String[] args) {
        

        
       long n = 1;
       int ctr = 0;

     do{
            long sum = 0;

            for(int i = 1;i<=n;i++)
            {
                if(n%i==0)
                {
                    sum = sum+i;
                    System.out.println(sum);
                }
            }
           
          if(sum == n)
            {
                ctr++;
                System.out.println(ctr+ " : "+n);
               
            }
            n = n+ 1;
           
        }while(ctr<=3);
        
        
        
    }
}