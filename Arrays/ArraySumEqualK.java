import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySumEqualK {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(cntSubarrays(arr, sc.nextInt()));
    }
     public static int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer> freq=new HashMap<>();
        int prefsum=0;
        int count=0;
        freq.put(0,1);
        for(int n:arr)
        {
            prefsum+=n;
            if(freq.containsKey(prefsum-k)){
                count+=freq.get(prefsum-k);
            }
            freq.compute(prefsum,(key,v)->v==null?1:v+1);
            
        }

        return count;
    }
}