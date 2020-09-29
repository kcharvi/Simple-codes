#Selection Sort:
package datastructures;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String args[])
    {
        int a[],n;
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the array element");
            a[i]=sc.nextInt();
        }
        selectionsort(a,n);
        
    }
    public static void selectionsort(int a[],int n)
    {
      
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                    min=j;
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
            
        }
        System.out.println("The sorted List");
        for(int i=0;i<n;i++)
          System.out.println(a[i]);
              
    }
}
