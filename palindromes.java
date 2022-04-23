public class palindromes {
    public static void main(String[] args) {
        
        for(int i = 10;i<=1000;i++)
        {
            int n = i;
            int r=0,num=0;
            while(n!=0)
            {
                r = n%10;
                num = (num*10)+r;
                n=n/10;
            }
            if(num==i)
            {
                System.out.println(i);
            }
        }
    }
    
}
