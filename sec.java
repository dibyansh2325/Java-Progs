import java.util.Scanner;
public class sec {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int inp, sec, hours, mins;
        int rem =0;

        System.out.println("Enter time in seconds :");

        inp = sc.nextInt();
        sc.close();

        hours = inp/(60*60);
        rem = inp%(60*60);
        mins = rem/60;
        sec = rem%60;
       

        System.out.println("Time = "+hours+" Hours "+mins+" mins "+sec+" sec ");

    }
    
}
