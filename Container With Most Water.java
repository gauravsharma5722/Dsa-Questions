import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        int i,j;
        int max_area=0;
        i=0;
        j=n-1;
        while(i!=j)
        {
            if((j-i)*Math.min(arr[i],arr[j])>max_area)
                max_area=(j-i)*Math.min(arr[i],arr[j]);
            if(arr[i]<arr[j])
            {
                i++;
            }
            else if(arr[i]>arr[j])
            {
                j--;
            }
            else
            {
                i++;
            }
            
        }
        return max_area;
    }
    
}



class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());  // number of test cases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // size of array
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            int ans = obj.maxWater(arr);
            System.out.println(ans);
        }
    }
}
