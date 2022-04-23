public class unique { 
    public static void main(String[] args) {
        
        String s = "Computer";
        int l = s.length();
        boolean unique = true;

        int ctr =0;
        for(int i = 0; i<l; i++)
        {
            ctr = 0;
            char c1 = s.charAt(i);
            for(int j = 0; j<l;j++)
            {
                char c2 = s.charAt(j);
                if(c1==c2)
                {
                    ctr ++;
                    //System.out.println(ctr);
                }
            }
        
            if(ctr > 1)
            {
               // System.out.println("Not Unique");
               unique = false;
               break;
            }
        }
        if(unique==false)
        {
            System.out.println(" Not Unique");
        }
        else
        {
            System.out.println("Unique");
        }         
                  
      }  
    }

