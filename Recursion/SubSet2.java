import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubSet2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[] str=s.split(" ");
        int n=str.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        getSubset(arr,0,n,new ArrayList<>(),list);
        System.out.println(list);
        
    }

    private static void getSubset(int[] arr, int i, int n, ArrayList<Integer> arrayList, List<List<Integer>> list) {
        list.add(new ArrayList<>(arrayList));
    
        for(int j=i;j<n;j++)
        {
            if(j>i && arr[j]==arr[j-1])
            {
                continue;
            }
            arrayList.add(arr[j]);
            getSubset(arr, j+1, n, arrayList, list);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
