import java.util.*;
public class LongestSubarraywithMajorityGreaterthanK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        System.out.println(longestSubarray(arr,k));
    }
    public static int longestSubarray(int[] arr, int k) {
        // Code Here
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int prefixSum=0,maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            prefixSum+=(arr[i]>k)?1:-1;
            if(prefixSum>0)
              maxLen=i+1;
            if(mp.containsKey(prefixSum-1)){
                maxLen=Math.max(maxLen,i-mp.get(prefixSum-1));
            }
            if(!mp.containsKey(prefixSum)) mp.put(prefixSum,i);
        }
        
        return maxLen;
    }
}
