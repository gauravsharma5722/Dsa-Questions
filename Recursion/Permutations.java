import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        int[] map = new int[arr.length];
        permute(arr, result,map,new ArrayList<>());
        System.out.println(result);
    }

    static void permute(int[] arr,List<List<Integer>> result,int[] map,List<Integer> current){

        if(current.size()==arr.length){
            result.add(new ArrayList<>(current));
            
            return;
        }

        for(int j=0;j<arr.length;j++){
            if(map[j]==0){
                current.add(arr[j]);
                map[j]=1;
                permute(arr,result,map,current);

                //backtracking
                current.remove(current.size()-1);
                map[j]=0;
            }
        }

    }
}
