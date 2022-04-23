//import java.util.Scanner;
public class selction {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        int a[] = {6,1,0,9,3};

        for(int i = 0; i<(a.length-1);i++)
        {
            int min = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }

            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        System.out.println("The Sorted array in accending order :");
        for(int l=0;l<a.length;l++)
        {
            System.out.print(a[l]);
        }


        
        
    }
    
}
