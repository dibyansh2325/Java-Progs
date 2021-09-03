import java.util.Scanner;
public class diff {
    public static void main(String[] args) {
      
        float p,t,r;
        double si,ci,a;
        Scanner sc = new Scanner(System.in);
     
      //input  
        System.out.println("Enter P");
        p=sc.nextFloat();
        System.out.println("Enter T");
        t=sc.nextFloat();
        System.out.println("Enter R");
        r=sc.nextFloat();
        sc.close();

        //calculate
        si = (p*t*r)/100;
        a = p*(Math.pow((1+(r/100)), t));
        ci = a-p;

        //output
        System.out.println("SI = "+si);
        System.out.println("CI = "+ci);
        System.out.println("Difference = "+(ci-si));



    }
    
}
