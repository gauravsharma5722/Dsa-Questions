import java.util.*;
class CountAllSubsequenceSumEqualK{
    static int countAllSubsequenceSumEqualK(int[] arr,int i,List<Integer> list, int k,int sum)
    {
        if(i==arr.length)
        {
            if(sum==k)
            {
                return 1;
            }
            return 0;
        }
        list.add(arr[i]);//Include
        int l=countAllSubsequenceSumEqualK(arr, i+1, list, k, sum+arr[i]);
        list.remove(list.size()-1);
        int r=countAllSubsequenceSumEqualK(arr, i+1, list, k, sum);
        return l+r;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int count=countAllSubsequenceSumEqualK(arr, 0,new ArrayList<>(), k, 0);
        System.out.println("the number of subsequence whose sum equal k is "+count);


    }
}