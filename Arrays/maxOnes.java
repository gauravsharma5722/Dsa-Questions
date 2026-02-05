import java.util.*;
public class maxOnes {
    public static void main(String[] args) {
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Maximum number of 1's after flipping at most k 0's: " + maxOnes(arr, k));
    }

    public int maxOnes(int arr[], int k) {
        // code here
       int maxLen=0;
        int left=0, zeroCount=0;
        
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0)
             zeroCount++;
            while(zeroCount>k)
            {
                if(arr[left]==0) zeroCount--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    
    }
    
}
