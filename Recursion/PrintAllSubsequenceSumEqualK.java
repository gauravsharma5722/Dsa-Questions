import java.util.ArrayList;
public class PrintAllSubsequenceSumEqualK {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6,7};
        int k = 7;
        printAllSubsequenceSumEqualK(arr, k, 0, new ArrayList<>(),0);
    }

    public static void printAllSubsequenceSumEqualK(int[] arr,int k,int i,ArrayList<Integer> list,int sum)
    {
        if(sum==k)
        {
            System.out.println(list);
            return;
        }
        if(i>=arr.length)
        {
            return;
        }
        if(sum+arr[i]<=k)
        {
            list.add(arr[i]);
            printAllSubsequenceSumEqualK(arr, k, i + 1, list,sum+arr[i]);
            list.remove(list.size() - 1);
        }
        
        printAllSubsequenceSumEqualK(arr, k, i + 1, list,sum);
        

    }
}
