import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        String[] s=new Scanner(System.in).nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    swap(arr,j+1,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b)
    {
        int temp=0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
