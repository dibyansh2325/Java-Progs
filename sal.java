import java.util.Scanner;
public class sal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sal, rent, food, misc, save;
        System.out.println("Enter your Salary :");
        sal = sc.nextFloat();
        sc.close();

        rent = sal*(1.f/2);
        food = sal*(1.f/5);
        misc = sal*(1.f/10);

        save = sal - (rent+food+misc);

        System.out.println("Rent:" + rent);
        System.out.println("Food :"+food);
        System.out.println("Misc :"+misc);
        System.out.println("Saved :" + save);



        
    }
    
}
