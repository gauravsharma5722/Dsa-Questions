import java.util.*;
class HeapSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Array before sorting:- "+Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Array after sorting:- "+Arrays.toString(arr));
    }

    private static void heapSort(int[] arr)
    {
        int n=arr.length;
        //build max heap
        for(int i=n/2;i>=0;i--)
        {
            heapfy(arr,i ,n);
        }

        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapfy(arr, 0,i );
        }
    }

    private static void heapfy(int[]arr , int i , int n)
    {
        int largest=i;
        int l=i*2+1;
        int r=i*2;

        if(l<n && arr[l]>arr[largest])
        {
            largest=l;
        }
        if(r<n && arr[r]>arr[largest])
        {
            largest=r;
        }

        if(largest !=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            //recursively heapify the affected sub-tree
            heapfy(arr,largest,n);
        }
    }
}