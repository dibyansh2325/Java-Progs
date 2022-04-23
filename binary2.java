import java.util.Scanner;
public class binary2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int x = sc.nextInt();
        sc.close();
        int p =-1;
         
        int ll=0,ul=9,mp;
        while(ll<=ul)
        {
            mp=(ll+ul)/2;
            if(a[mp]<x)
            ll=mp+1;
            if(a[mp]>x)
            ul=mp-1;
            if(a[mp]==x)
            {
                p=mp;
                break;
            }
        }
        if(p!=-1)
        {
            System.out.println("Search Successfull");
        }
        else{
            System.out.println("Search unsucessfull");
        }

    }
    
}
