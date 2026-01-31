import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        String[] s=new Scanner(System.in).nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(arr));

        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    // private static void merge(int[] arr, int low, int mid, int high) {
    //     int[] left=new int[mid-low+1];
    //     int[] right=new int[high-mid];
    //     for(int i=0;i<mid-low+1;i++)
    //     {
    //         left[i]=arr[low+i];
    //     }
    //     for(int j=0;j<high-mid;j++)
    //     {
    //         right[j]=arr[mid+j+1];
    //     }
    //     int i=0;
    //     int j=0;
    //     int index=low;
    //     while(i<left.length && j < right.length)
    //     {
    //         if(left[i]<right[j])
    //         {
    //             arr[index]=left[i];
    //             i++;
    //         }
    //         else{
    //             arr[index]=right[j];
    //             j++;
    //         }
    //         index++;
    //     }
    //     while(i<left.length)
    //     {
    //         arr[index]=left[i];
    //         i++;
    //         index++;
    //     }
    //     while(j<right.length)
    //     {
    //         arr[index]=right[j];
    //         j++;
    //         index++;
    //     }
        
    // }


    static void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];

    int i = low, j = mid + 1, k = 0;

    while (i <= mid && j <= high) {
        if (arr[i] <= arr[j])
            temp[k++] = arr[i++];
        else
            temp[k++] = arr[j++];
    }

    while (i <= mid) temp[k++] = arr[i++];
    while (j <= high) temp[k++] = arr[j++];

    for (int x = 0; x < temp.length; x++)
        arr[low + x] = temp[x];
}
    
}
