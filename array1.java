import java.util.Scanner;
public class array1
{
    public static void main(String[] args) {
        
        int x[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <x.length; i++)
        {
            System.out.println("Enter number "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("OUTPUT");
        for(int j = 0; j<x.length;j++)
        {
            
            System.out.println(x[j]);
        }
        sc.close();
    }
}