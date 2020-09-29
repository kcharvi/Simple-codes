package datastructures;

import java.util.Scanner;

public class QuickSort {
     
    public static void main(String args[])
    {
        int n,a[];
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the array element");
            a[i]=sc.nextInt();
        }
        quickSort(a,0,n);
        System.out.println("The sorted List");
        for(int i=0;i<n;i++)
        {
            System.out.println("" +a[i]);
        }
    }

    public static void quickSort(int a[],int l,int h)
    {
        
        if(l<h)
        {
        int mid=partition(a,l,h);
        quickSort(a,l,mid);
        quickSort(a,mid+1,h);
        }
    }
    
    public static int partition(int a[],int l,int h)
    {
        int   i=1,j=h-1,pivot;
         pivot=a[l];
           
           while(i<j)
           {
                while(a[i]<pivot)
                {
                    i++;
                }
                while(a[j]>pivot)
                {
                    j--;
                }
              
                if(i<j)
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
           }
                if(j<i)
                {
                    int t=a[j];
                    a[j]=a[l];
                    a[l]=t;
                }
       
         return j;
}  
}
 
