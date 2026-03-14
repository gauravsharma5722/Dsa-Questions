// Print all subsequence of a array
// arr={1,2,3}
// {}
// 1
// 1 2
// 1 3 
// 1 2 3
// 2
// 2 3
// 3
import java.util.ArrayList;
public class PrintAllSubsequence {

    public static void printSubsequence(int arr[],int i,ArrayList<Integer> list)
    {
        if(i==arr.length)
        {
            System.out.println(list);
            return;
        }
        // include
        list.add(arr[i]);
        printSubsequence(arr, i+1, list);
        // exclude
        list.remove(list.size()-1);
        printSubsequence(arr, i+1, list);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        printSubsequence(arr,0,new ArrayList<>());
    }
    
}
