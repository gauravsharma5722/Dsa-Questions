

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;

public class SumOfMinimums {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int n=input.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        int sumofMin=0;
        ArrayList<Integer> prev= PSE(arr);
        ArrayList<Integer> next= NSE(arr);
        // System.out.println(prev);
        // System.out.println(next);
        for(int i=0;i<n;i++){
            int left=i-prev.get(i);
            int right=next.get(i)-i;
            sumofMin=(sumofMin+(arr[i]*left*right));
        }
        System.out.println(sumofMin);
       
    }


    public static ArrayList<Integer> NSE(int[] arr){
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
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

     public static ArrayList<Integer> PSE(int[] arr){
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
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



}
