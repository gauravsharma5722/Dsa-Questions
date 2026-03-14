import java.util.ArrayList;
public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6,7};
        int k = 7;
        printCombinationSum(arr, k, 0, new ArrayList<>(),0);
    }
    public static void printCombinationSum(int[] arr, int target, int index, ArrayList<Integer> currentList, int sum) {
        if (sum == target) {
            System.out.println(currentList);
            return;
        }
        if (index >= arr.length) {
            return;
        }
        if (sum + arr[index] <= target) {
            currentList.add(arr[index]);
            printCombinationSum(arr, target, index, currentList, sum + arr[index]);
            currentList.remove(currentList.size() - 1);
        }
        printCombinationSum(arr, target, index + 1, currentList, sum);
    }
}
