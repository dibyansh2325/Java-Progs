public class vcsc {
    public static void main(String[] args) {
        
        String s = "The World isn't Ending Bro!!!";
        int v=0,c=0,n=0,sc=0;
        char ch ;
        s = s.trim();
        s = s.toUpperCase();
        int l = s.length();

        for(int i=0; i<l;i++)
        {
            ch = s.charAt(i);
            

        if(Character.isLetter(ch)==true)
         {
            
            if( ch == 'A'||ch == 'E'||ch=='I'||ch=='O'||ch=='U')
            {
                v++;
            } 
            else
            {
                c++;
            }
         }
         else if(Character.isDigit(ch)==true)
         {
             n++;
         }
         else if(Character.isLetterOrDigit(ch)== false && Character.isWhitespace(ch)==false)
         {
             sc++;
         }

    }

    System.out.println(" Sentance = "+s);
    System.out.println(" No of Vowels = "+v);
    System.out.println(" No of Consonents = "+c);
    System.out.println(" No of Digits = "+n);
    System.out.println(" No of Special Characters = "+sc);
    

    }
    
}
