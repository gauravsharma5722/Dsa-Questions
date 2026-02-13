import java.util.Scanner;
import java.util.Arrays;
class BinarySearch{
    public static void main(String[] args){
        String[] s=new Scanner(System.in).nextLine().split(" ");
        int n=s.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int key=new Scanner(System.in).nextInt();
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==key)
            {
                System.out.println("Element found at index "+mid);
                return;
            }
            else if(a[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        System.out.println("Element not found");
    }
}