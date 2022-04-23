public class fabwhile {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int sum;
        System.out.println(n1);
        System.out.println(n2);
        int i = 2;
        while(i<=10)
        {
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;

            i++;

        }
    
    }
}
