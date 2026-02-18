import java.util.Arrays;
import java.util.Scanner;

public class Count_Inversions {
    
    public static void main(String[] args) {
        String[] s=new Scanner(System.in).nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(arr));
        int count=mergeSort(arr,0,n-1);
        System.out.println(count);
    }
    static int inversionCount(int arr[]) {
        // Code Here
        
        return mergeSort(arr,0,arr.length-1);
    }
    
    static int mergeSort(int[] arr,int l,int r)
    {
        int count=0;
        if(l<r)
        {
            int mid=(l+r)/2;
            count+=mergeSort(arr,l,mid);
            count+=mergeSort(arr,mid+1,r);
            count+=merge(arr,l,mid,r);
        }
        return count;
    }
    static int merge(int[] arr,int l,int mid,int r)
    {
        int[] k=new int[r-l+1];
  
        int i=l;
        int j=mid+1;
        int count=0;
        int p=0;
        while(i<=mid && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                k[p++]=arr[i++];
                
            }
            else
            {
                k[p++]=arr[j++];
                count+=(mid-i+1);
            }
        }
        while(i<=mid)
        {
            k[p++]=arr[i++];
        }
        while(j<=r)
        {
            k[p++]=arr[j++];
          
        }
        
        p=0;
        for(i=l;i<=r;i++)
        {
            arr[i]=k[p];
            p++;
        }
        return count;
    }
    
}
