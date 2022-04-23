// WAP to calulate CI or SI acoording to the user input using funtions

import java.util.Scanner;

public class interests {

    public float si(float p, float t, float r)
    {
        float si = (p*t*r)/100;
        return si;
    }

    public float ci(float p, float t, float r)
    {
        double a = p*Math.pow(1+(r/t),t);
        double ci = a-p;
        float c = (float)ci;
        return c;


    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest \n \n ");
        int ch = sc.nextInt();

        System.out.println("Enter Principle");
        float p = sc.nextFloat();
        System.out.println("Enter Rate");
        float r = sc.nextFloat();
        System.out.println("Enter Time in Years");
        float t = sc.nextFloat();

        interests obj = new interests();

        if(ch==1)
        {
            float si = obj.si(p, t, r);
            System.out.println("Simple Interest = "+ si);
        }
        else if(ch==2)
        {
            
            float ci = obj.ci(p, t, r);            
            System.out.println("Compound Interest = "+ ci);
        }
        else 
        {
            System.out.println("WRONG INPUT");
        }
        sc.close();
    }
    
}
