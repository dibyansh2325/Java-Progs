public class letters {
    public static void main(String[] args) {
        
        String s = "The World is ending";
        s = s.trim();
        int l = s.length();
        int ctr =0;
        char c;
        for(int i =0; i<l;i++)
        {
            c = s.charAt(i);
            if(Character.isLetter(c)==true)
            {
                ctr++;
            }
        }
        System.out.println("No of letters in sentance = "+ctr);
    }
    
}
