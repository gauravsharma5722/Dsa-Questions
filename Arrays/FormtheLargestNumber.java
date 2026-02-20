import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormtheLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String[] s=sc.nextLine().split(" ");
            int n=s.length;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(s[i]);
            }


            System.out.println("Largest Number is: " + findLargest(arr));
    }
      public static String findLargest(int[] arr) {
        // code here
        List<String> res = new ArrayList<>();
        
        for(int a: arr){
            res.add(a+"");
        }
        
        res.sort((a,b)-> (b+a).compareTo(a+b));
        
        // check for whether first string is 0 or not.
        
        if(res.get(0).equals("0")) return "0";
        
        StringBuilder ans = new StringBuilder();
        
        for(String r: res)
          ans.append(r);
         
        return ans.toString();
        
    }
}
