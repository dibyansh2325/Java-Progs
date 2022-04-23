
import java.util.Scanner;


public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1-Area of Square");
        System.out.println("2-Area of rectangle");
        System.out.println("3-Area of Circle");

        System.out.println("Enter your Choice");
        int c = sc.nextInt();

        int area;

        if(c==1)
        {
            System.out.println("Enter side");
            int side = sc.nextInt();
            area = side*side;
            System.out.println("Area = "+area);
        }
        else if(c==2)
        {
            System.out.println("Enter Lenght");
            int l = sc.nextInt();
            System.out.println("Enter Breadth");
            int b = sc.nextInt();

            area = l*b;
            System.out.println("Area = "+ area);
        }
        else if(c==3)
        {
            System.out.println("Enter Radius");
            int r = sc.nextInt();
            area = (22/7)*r*r;
            System.out.println("Area = "+ area);
        }
        else 
        {
            System.out.println("Wrong Input");
        }

sc.close();
    }
}
