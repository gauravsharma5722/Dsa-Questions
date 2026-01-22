import java.util.*;
public class StockSpan {
    public static ArrayList<Integer> calculateSpans(int[] arr) {
        // code here
        int n=arr.length;
        int cgi=0;
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++)
        {
            // int prev=i-1;
            // if(arr[prev]<=arr[i])
            // {
            //     ans.set(i,ans.get(prev)+ans.get(i));
            //     if(arr[prev] != arr[cgi] && arr[cgi]<=arr[i])
            //     {
            //         ans.set(i,ans.get(cgi)+ans.get(i));
            //         cgi=i;
            //     }
            // }

            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans.add(i+1);
            }
            else
            {
                ans.add(i-st.peek());
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int n=str.length;
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=Integer.parseInt(str[i]);
        }
        ArrayList<Integer> spans = calculateSpans(prices);
        System.out.println(spans);
    }
}
