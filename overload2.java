public class overload2 {
    public float area(int s)
    {
        float a = s*s;
        return a;
    }
    public float area(int l, int b)
    {
        int a = l*b;
        return a;

    }
    public float area(float b, float h)
    {
        float a = (1.f/2)*b*h;
        return a;
    }
    public float area(float r)
    {
        float a = (22.f/7)*r*r;
        return a;    }
    public static void main(String[] args) {
        overload2 obj = new overload2();
        float a = obj.area(5);
        System.out.println("Area = "+ a);
        float b = obj.area(4, 2);
        System.out.println("Area = "+ b);
        float c = obj.area(3.5f, 5.0f);
        System.out.println("Area = "+ c);
        float d = obj.area(7.3f);
        System.out.println("Area = "+ d);
        

    }
    
}

