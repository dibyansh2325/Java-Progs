public class word {
    public static void main(String[] args) {
        
        String s = " The World is Ending";
        s = s.trim();
        s = " "+s;
        int l = s.length();
        int ctr = 0;
        char c;

        for(int i =0; i<l; i++)
        {
            c = s.charAt(i);
            if(c == ' ')
            {
                ctr++;
            }
        }

        System.out.println("No of words = "+ ctr);

        
    }
    
}
