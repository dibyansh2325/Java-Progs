import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        int x[]=new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<x.length;i++)
        {
            System.out.println("Enter integer "+(i+1));
            x[i]= sc.nextInt();
        }

        System.out.println("Enter number to Search");
        int y = sc.nextInt();
        int p =-1;

        for(int a=0; a<x.length;a++)
        {
            if(x[a]==y)
            {
                p = a+1;
            }
            else 
            {
                continue;
            }
        }
        if(p!=-1)
        {
            System.out.println(y + " Found at "+ p);
        }
        else
        {
            System.out.println(y + " Not Found");
        }
        sc.close();
        
    }
    
}
