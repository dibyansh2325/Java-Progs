public class overload {
    public void area(int s)
    {
        int a = s*s;
        System.out.println("Area = "+ a);
    }
    public void area(int l, int b)
    {
        int a = l*b;
        System.out.println("Area = "+ a);

    }
    public void area(float b, float h)
    {
        float a = (1.f/2)*b*h;
        System.out.println("Area ="+a);
    }
    public void area(float r)
    {
        float a = (22.f/7)*r*r;
        System.out.println("Area = "+a);    }
    public static void main(String[] args) {
        overload obj = new overload();
        obj.area(5);
        obj.area(4, 2);
        obj.area(3.5f, 5.0f);
        obj.area(7.3f);
        

    }
    
}
