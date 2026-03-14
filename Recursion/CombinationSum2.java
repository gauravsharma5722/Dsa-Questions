import java.util.*;
public class CombinationSum2 {
    private void findCombination(int i,int[] arr,int k,List<List<Integer>> ans,List<Integer> list)
    {
       if(k==0)
       {
        ans.add(new ArrayList<>(list));
        return;
       }
       for(int j=i;j<arr.length;j++)
       {
        if(j>i && arr[j]==arr[j-1]) continue;
        if(arr[j]>k) break;
        list.add(arr[j]);
        findCombination(j+1,arr,k-arr[j],ans,list);
        list.remove(list.size()-1);
       }
    }
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int k=8;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        new CombinationSum2().findCombination(0,arr,k,ans,new ArrayList<>());
        System.out.println(ans);
    }

}
