Insertion Sort:
package datastructures;
import java.util.Scanner;
public class InsertionSort {
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
        insertionsort(a,n);     
    }
    public static void insertionsort(int a[],int n)
    {
      int hole,value;
        for(int i=1;i<n;i++)
        {
            value=a[i];
            
            for(hole=i;hole>0&&a[hole-1]>value; hole=hole-1)
            {        
                           a[hole]=a[hole-1];   
            }
            a[hole]=value; 
                
        }
         System.out.println("The sorted List");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}

