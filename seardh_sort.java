import java.util.*;

class ser_sor{
    private int arr[],n;
    ser_sor(int N)
    {
        arr=new int[N];
        n=N;
    }
    void get_array()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
    }
    int  partition(int arr[],int s,int e)
    {
        int key=arr[e];
        int i=s-1,j=s;
        while(j<e)
        {
            if(arr[j]<key)
            {
                i++;
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
           j++;
        }
        int swap=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=swap;
                return i+1;
    }
    private void quick(int arr[],int i,int N)
    {
        if(i<N)
        {
            int mid=partition(arr,i,N);
           quick(arr,i,mid-1);
           quick(arr,mid+1,N);
        } 
    }
    void sort()
    {
        System.out.println();
        quick(arr,0,4);
        for(int i=0;i<n;i++)
         System.out.println(arr[i]);
    }
    boolean b_search(int arr[],int s,int e,int key)
    {
        if(s>e) return false;
        int mid=(s+e)/2;
        if(key==arr[mid]) return true;
        if(key<=arr[mid])
         return  b_search(arr, s, mid-1, key);
        
        return  b_search(arr, mid+1, e, key)  ;
       
    }
    void search(int key)
    {
        if(b_search(arr, 0, n-1, key))  
        System.out.println("Element found!!");
        else  
        System.out.println("Element not found"); 
    }
}
public class seardh_sort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        ser_sor s=new ser_sor(n);
        System.out.println("Enter the elements of array:");
        s.get_array();
        s.sort();
        System.out.println("Enter a element to be searched: ");
        s.search(sc.nextInt());
    }
    
}
