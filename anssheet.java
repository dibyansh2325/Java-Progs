import java.util.Scanner;
public class anssheet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Answer Sheets");
        int n = sc.nextInt();

        int mark = 0;
        int m85 = 0;
        int l39 = 0;

        double pm85, pl39;
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter Mark ");
            mark = sc.nextInt();
            if(mark >=85)
            {
                m85++;
            }

            if(mark<=39)
            {
                l39++;
            }

        }
        sc.close();
        System.out.println(m85+ "\t"+l39 );
        pm85 = ((double)m85/n)*100;
       // System.out.println(pm85);
        pl39 = ((double)l39/n)*100;

       System.out.println("Number of Sheets checked = "+ n);
        System.out.println("Percentage of Students Scoring >=85 = "+pm85);
        System.out.println("Percentage of Students Scoring <=39 = "+pl39);

    }
    
}