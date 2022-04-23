import java.util.Scanner;
public class ans {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = 'n';
        int ctr =0;
        int f1 = 0, f2 = 0;
        double p1,p2;
        

        do{
            System.out.println("Do you want to enter Mark? Press Y/N");
            c = sc.next().charAt(0);
            int m;
            if(c=='y' || c=='Y')
            {
                ctr++;
                System.out.println("Enter Mark");
                m = sc.nextInt();

                if(m>=85)
                {
                    f1++;
                }
                else if(m<=39)
                {
                    f2++;
                }
            
            }
           /* else
            {
                break;
            }*/
    

        }
        while(c!='n' && c!='N');
        sc.close();

        p1 = ((double)f1/ctr)*100;
        p2 = ((double)f2/ctr)*100;

        System.out.println("Number of Answer Sheet Checked = "+ctr);
        System.out.println("Number of Students Who Scored >= 85 "+p1);
        System.out.println("Number of Students Who Scored <=39 "+p2);


        
    }
    
}
