import java.util.ArrayList;

public class PrintInceasingSubsequence {
    public static void main(String[] args) {
        int arr[]={10,20,3,30,40,50};
        printIncreasingSubsequence(arr,0,new ArrayList<>());
    }
    public static void printIncreasingSubsequence(int arr[],int i,ArrayList<Integer> list)
    {
        if(i==arr.length)
        {
            System.out.println(list);
            return;
        }
        //include
        if( list.size()==0 || arr[i]>list.get(list.size()-1))
        {
        list.add(arr[i]);
        printIncreasingSubsequence(arr,i+1,list);
        list.remove(list.size()-1);
        }
        //exclude
        printIncreasingSubsequence(arr, i+1, list);
    }
}
