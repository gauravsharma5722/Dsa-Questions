import java.util.ArrayList;

import java.util.List;

public class PermutationsOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permute(0,arr,result);
    }

    static void permute(int i,int[] arr,List<List<Integer>> result)
    {
        if(i==arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            for (int x : arr) {
                list.add(x);
            }
            result.add(list);
            return;
        }
        for(int j=i;j<arr.length;j++)
        {
            swap(arr,i,j);
            permute(i+1,arr,result);
            swap(arr,i,j); // backtrack
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
