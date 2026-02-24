import java.util.HashMap;
import java.util.Map;

public class LongestSpanInTwoBinaryArray {

    public static void main(String[] args) {
        int[] arr1={0,1,0,0,0,0};
        int[] arr2={1,0,1,0,0,1};
        System.out.println(equalSumSpan(arr1,arr2));
    }
   public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int n=a1.length;
        Map<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        mp.put(0,-1);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1+=a1[i];
            sum2+=a2[i];
            int diff=sum2-sum1;
            if(mp.containsKey(diff))
            {
                ans=Math.max(ans,i-mp.get(diff));
            }
            else
            {
                mp.put(diff,i);
            }
        }
        return ans;
    }
}