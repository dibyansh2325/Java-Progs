public class car {
    
    
    public void alto(){
        int speed;
        speed = 80;
        float mil = 40;             //for calculating milege.
        System.out.println("Speed of alto = "+speed);
        System.out.println("Milage of alto = "+mil);
       
    }
    public void audi(){
        int speed = 120;
        System.out.println("Speed of audi= "+speed);

    }
    public void benz(){
       int  speed = 100;
       System.out.println("Speed of benz= "+speed);

    }
    public void thar(){
        int speed = 110;
        System.out.println("Speed of thar = "+speed);

    }
    public static void main(String[] args) {
        
        car object = new car();
        object.alto();
        object.audi();
        object.benz();
        object.thar();
        
    }
    
}
