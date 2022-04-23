import java.util.Scanner;
public class binary
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int x = sc.nextInt();
        sc.close();


        int ll=0, ul = a.length-1, mp,p=-1;

        while(ul>ll)
        {
            mp = (ll+ul)/2;

            if(a[mp]<x)
            {
                ll = mp+1;
            }
            if(a[mp]>x)
            {
                ul = mp-1;
            }
            if(x==a[mp])
            {
                p = mp;
            }

        }
        if(p!=-1)
        {
            System.out.println(x + " is Found");

        }
        else
        {
            System.out.println(x + " is not Found");
        }
    }
}