import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarrayswithgivenXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(subarrayXor(arr, sc.nextInt()));
    }
    public static long subarrayXor(int arr[], int k) {
        // code here
         Map<Integer,Integer> freq=new HashMap<>();
         int pref=0;
         int count=0;
         freq.put(0,1);
         for(int n: arr)
         {
             pref^=n;
             if(freq.containsKey(pref^k)){
                count+=freq.get(pref^k);
            }
            freq.compute(pref,(key,v)->v==null?1:v+1);
         }
        
        return count;
    }
}
