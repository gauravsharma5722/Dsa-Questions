import java.util.*;
class Selection
{
    public static void main(String[] args) {
        String[] s=new Scanner(System.in).nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n-1;i++)
        {
            int key=arr[i];
            int pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<key)
                {
                    key=arr[j];
                    pos=j;
                }
            }
            arr[pos]=arr[i];
            arr[i]=key;
        }

        System.out.println(Arrays.toString(arr));   
    }
}