import java.util.Scanner;
import java.util.ArrayList;
public class MissingElementInrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int low=sc.nextInt();
        int high=sc.nextInt();
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        ArrayList<Integer> missingElement = missingRange(arr, low, high);
        if (missingElement.size() > 0) {
            System.out.println("Missing element(s) in the range [" + low + ", " + high + "] is/are: " + missingElement);
        } else {
            System.out.println("No missing element in the range [" + low + ", " + high + "].");
        }
    }
      public static  ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        int[] ispresent=new int[high-low+1];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(low <= arr[i] && arr[i] <= high)
            {
                ispresent[arr[i]-low]=1;
            }
        }
        for(int i=0;i<ispresent.length;i++)
        {
            if(ispresent[i]==0)
            {
                ans.add(i+low);
            }
        }
        return ans;
    }

}
