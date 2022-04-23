public class volume {
   
        public void vol(int s)
        {
            int v = s*s*s;
            System.out.println("Volume = "+v);
        }   
        public void vol(float r)
        {
            double v = (4/3)*(22/7)*r;
            System.out.println("Volume = "+v);
        }     
        public void vol(int l, int b, int h)
        {
            float v = l*b*h;
            System.out.println("Volume = "+v);
        }

        public static void main(String[] args) {
            volume obj = new volume();
            obj.vol(5);
            obj.vol(3.4f);
            obj.vol(4,5,6);

        }
    }
    

 