import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {        //main method
        
        Scanner sc = new Scanner(System.in);       //creating Scanner object

        String name;         //varaible for storing name
        long no;             //for phone number
        float km;            //for storing number of km travelled
        float fare;          //for storing fare
        float d;             //for storing discount
        float tf;            //for storing total fare
        
        System.out.println("Enter your Name");
        name = sc.nextLine();
        System.out.println("Enter your Phone Number");
        no = sc.nextLong();
        System.out.println("Enter number of kms travelled");
        km = sc.nextFloat();
        sc.close();

        fare = km*3;                //calculating fare
        d = (5.f/100)*fare;         //calculating discount
        tf = fare-d;                //calculating total fare


        System.out.println("\t CAB SERVICE");
        System.out.println("___________________________________________________________");
        System.out.println();
        System.out.println("\t NAME : "+name);
        System.out.println("\t PHONE NUMBER : "+no);
        System.out.println("\t KM TRAVELLED : "+km);
        System.out.println("\t FARE : "+fare);
        System.out.println("\t DISCOUNT : "+d);
        System.out.println("\t TOTAL FARE : "+tf);





    }
    
}
