import java.util.Scanner;


 class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO SBI");

        System.out.println("1. Deposit\n 2. Withdraw");
        System.out.println("Enter Your Choice");
        int c = sc.nextInt();
        int a = 10000;

        if(c==1)
        {
            System.out.println("Enter Deposit Amount");
            int d = sc.nextInt();
            a = a + d;
            System.out.println("Total amount = "+a);

        }
        else if(c==2)
        {
            System.out.println("Enter Withdrawing Amount");
            int w = sc.nextInt();
            a = a - w;
            System.out.println("Total Amount = "+a);
        }
        else 
        {
            System.out.println("Wrong Input");
        }
        sc.close();
    }
     
    
}
