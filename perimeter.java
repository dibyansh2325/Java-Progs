//WAP to calculate the perimeters of square, rectangle, circle and triangle using void functions
import java.util.Scanner;
public class perimeter {

    Scanner sc = new Scanner(System.in);

    public void square()
    {
        System.out.println("Enter Side");
        int s = sc.nextInt();
        int a = s*s;
        System.out.println("Area of Square = "+a);
    }

    public void rectangle()
    {
        System.out.println("Enter Length");
        int l = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        int a = l*b;
        System.out.println("Area of Rectangle = "+a);
    }

    public void triangle()
    {
        System.out.println("Enter Base");
        int b = sc.nextInt();
        System.out.println("Enter Height");
        int h = sc.nextInt();
        float a = (1.f/2)*b*h;
        System.out.println("Area of Triangle = "+a);
    }

    public void circle()
    {
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        float a = (22.f/7)*r*r;
        System.out.println("Area of Circle = "+ a);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        area obj = new area();

        System.out.println("1. Area of Square");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Area of Circle \n");
        System.out.println("ENTER YOUR CHOICE");

        int c = n.nextInt();

        if(c==1)
        {
            obj.square();
        }
        else if(c==2)
        {
            obj.rectangle();
        } 
        else if(c==3)
        {
            obj.triangle();
        }
        else if(c==4)
        {
            obj.circle();
        }
        else
        {
            System.out.println("Wrong Input");
        }
        n.close();
    
    
    }


    
}
