import java.io.*;
import java.util.ArrayList;
import java.util.*;
class MaxVisible
{
    static int maxVisible(int arr[])
    {
        int n=arr.length;
        int max=0;
        ArrayList<Integer> Nge=nextGreaterElement(arr);
        ArrayList<Integer> Pge=prevGreaterElement(arr);
        System.out.println(Nge);
        System.out.println(Pge);
        for(int i=0;i<n;i++)
        {
            int right=Nge.get(i);
            int left=Pge.get(i);
            int count=right-left-1;
            if(count>max)
            {
                max=count;
            }
        }

        return max;
    }

    public static ArrayList<Integer> nextGreaterElement(int arr[])
    {
        int n=arr.length;
        ArrayList<Integer> nge=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nge.add(0,n);
            }
            else
            {
                nge.add(0,s.peek());
            }
            s.push(i);
        }
        return nge;
    }

    public static ArrayList<Integer> prevGreaterElement(int arr[])
    {
        int n=arr.length;
        ArrayList<Integer> pge=new ArrayList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]<arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                pge.add(-1);
            }
            else
            {
                pge.add(s.peek());
            }
            s.push(i);
        }
        return pge;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int n=input.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        
        System.out.println(maxVisible(arr));

    }



}