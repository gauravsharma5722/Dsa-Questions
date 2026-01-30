import java.util.*;
public class InterLeaveTheFirstHalf {

     public static void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n=q.size();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=q.poll();
        }
        int i=0; int j=n/2;
        
        while(j<n)
        {
            q.offer(a[i]);
            i++;
            q.offer(a[j]);
            j++;
        }
        
    }


    public static void main(String[] args) {
        Queue<Integer> Queue=new LinkedList<>();
        String[] s=new Scanner(System.in).nextLine().split(" ");
        for(String a:s)
        {
            Queue.offer(Integer.parseInt(a));
        }
        System.out.println(Queue);

        rearrangeQueue(Queue);
        System.out.println(Queue);

    }
}
