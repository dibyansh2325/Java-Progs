//WAP to input, calculate and output total marks and percentage

import java.util.Scanner;
public class exam2{
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);

        int maths, phy, che, bio;
        System.out.println("Enter Marks in Maths : ");
        maths=sc.nextInt();
        System.out.println("Enter Marks in Physics : ");
        phy=sc.nextInt();
        System.out.println("Enter Marks in Chemistry : ");
        che=sc.nextInt();
        System.out.println("Enter Marks in Biology : ");
        bio=sc.nextInt();
        sc.close();

        //calculate
        int total = maths + phy + che + bio;
        double per = total/4;

        //output
        System.out.println("Total Marks = "+total);
        System.out.println("Percent = "+per);

    }
}