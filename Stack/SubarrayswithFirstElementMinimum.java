import java.util.*;
class SubarrayswithFirstElementMinimum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[] str=s.split(" ");
        int[] arr=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        System.out.println(countSubarrays(arr));
    }
       public static int countSubarrays(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> stk=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            
            while(stk.size()>0 && stk.peek()>arr[i])
            {
                stk.pop();
            }
            stk.push(arr[i]);
            count+=stk.size();
        }
        return count;
    }
}