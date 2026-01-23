import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
class SumOfSubArrayRange {
    public static int subArrayRanges(int[] arr) {
        int n=arr.length;
        int totalMax=0;
        int totalMin=0;
        ArrayList<Integer> prevMax= previousGreater(arr);
        ArrayList<Integer> nextMax= nextGreater(arr);
        ArrayList<Integer> prevMin= previousMin(arr);
        ArrayList<Integer> nextMin= nextMin(arr);
        

        for(int i=0;i<n;i++){
            int leftMax=i-prevMax.get(i);
            int rightMax=nextMax.get(i)-i;
            totalMax+=(arr[i]*leftMax*rightMax);

            int leftMin=i-prevMin.get(i);
            int rightMin=nextMin.get(i)-i;
            totalMin+=(arr[i]*leftMin*rightMin);
        }
        

        return totalMax - totalMin;
    }


    public static ArrayList<Integer> nextGreater(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(0,n);
            }else{
                res.add(0,stack.peek());
            }
            stack.push(i);
        }
        return res;
    }

    public static ArrayList<Integer> previousGreater(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                res.add(stack.peek());
            }
            stack.push(i);
        }
        return res;
    }

    public static ArrayList<Integer> nextMin(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(0,n);
            }else{
                res.add(0,stack.peek());
            }
            stack.push(i);
        }
        return res;
    }

    public static ArrayList<Integer> previousMin(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                res.add(stack.peek());
            }
            stack.push(i);
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int n=input.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }

        int res=subArrayRanges(arr);
        System.out.println(res);
    }
}