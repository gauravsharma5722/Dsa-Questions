import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Sum_Subset{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[] str=s.split(" ");
        int n=str.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        List<Integer> list=new ArrayList<>();
        getSumSubset(arr,0,n,0,list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void getSumSubset(int[] arr,int i,int n,int sum,List<Integer> list) {
            if(i==n)
            {
                list.add(sum);
                return;
            }
            getSumSubset(arr, i+1, n, sum+arr[i], list);
            getSumSubset(arr, i+1, n, sum, list);

        
            
    }
    
}