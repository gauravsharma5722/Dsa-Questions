import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        String[] s=new Scanner(System.in).nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high) {

        if(low<high)
        {
            int p=partition(arr,low,high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
        
    }

    private static int partition(int[] arr, int low, int high) {
        int i=low-1;
        int pivot=arr[high];

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                swap(arr,i+1,j);
                i++;
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void swap(int[] arr,int a,int b)
    {
        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
