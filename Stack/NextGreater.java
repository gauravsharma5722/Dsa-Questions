
import java.io.*;
import java.util.*;
class NextGreater
{
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
        Stack<Integer> stack =new Stack<>();
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
            {
                stack.pop();
            }
            
            if(stack.isEmpty())
            {
                
                res[i]=-1;
            }
            else
            {
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
            
        }


        System.out.println(Arrays.toString(res));


    }
}