public class loopqs {
    public static void main(String[] args) {
        int ctr = 0;
        int n = 1000;
        while(n>10)
        {
            n=n/10;
            ctr++;

        }

        System.out.println("Loop Ran "+ctr+" times and n = "+n);
    }
    
}
