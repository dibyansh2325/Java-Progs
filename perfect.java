public class perfect {
    public static void main(String[] args) {
        
        //int n = 6;
        int ctr=0;
        int n = 6;
        
        //for(int n = 6; n<1000;n++)
        do
        {
            int sum = 0;
        for(int i = 1; i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
                //System.out.println(sum);
            }
        }
        if(sum == n)
        {
            ++ctr;
            System.out.println(ctr +" : "+n);

        }
        n++;
        }while(ctr<=5);
    }
    
}
