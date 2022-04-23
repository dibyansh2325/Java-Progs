/*WAP to caclulate and print the areas of 
1.Square(side*side)
2.Rectangle(lenght*breadth)
3.Triangle(1/2*base*height)
4.Circle(22/7*r*r)
using void Functions */

import java.util.Scanner;
public class area2 {

    public void square(int s)
    {
        int a = s*s;
        System.out.println("Area of Square = "+a);
    }

    public void rectangle(int l, int b)
    {
        int a = l*b;
        System.out.println("Area of Rectangle = "+a);
    }

    public void triangle(int b, int h)
    {
        float a = (1.f/2)*b*h;
        System.out.println("Area of Triangle = "+a);
    }

    public void circle(int r)
    {
        float a = (22.f/7)*r*r;
        System.out.println("Area of Circle = "+ a);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        area2 obj = new area2();

        System.out.println("1. Area of Square");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Area of Circle \n");
        System.out.println("ENTER YOUR CHOICE");

        int c = n.nextInt();

        if(c==1)
        {   
            System.out.println("Enter Side");
            int s = n.nextInt();
            obj.square(s);
        }
        else if(c==2)
        {
            System.out.println("Enter Length");
            int l = n.nextInt();
            System.out.println("Enter Breadth");
            int b = n.nextInt();
            obj.rectangle(l,b);
        } 
        else if(c==3)
        {
            System.out.println("Enter Base");
            int b = n.nextInt();
            System.out.println("Enter Height");
            int h = n.nextInt();
            obj.triangle(b,h);
        }
        else if(c==4)
        {
            System.out.println("Enter Radius");
            int r = n.nextInt();
            obj.circle(r);
        }
        else
        {
            System.out.println("Wrong Input");
        }
        n.close();
    
    
    }


    
}
