import java.util.*;
public class ImplementKQueue {
    public static void main(String[] args) {
        System.out.println("Implement K Queues in a Single Array - Placeholder");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        sc.nextLine();
        int[][] query=new int[q][3];
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<3;j++)
                query[i][j]=-1;
        }
        KQueue kQueue=new KQueue(n, k);
        for(int i=0;i<q;i++)
        {
            String[] s=sc.nextLine().split(" ");
            int size=s.length;
            for(int j=0;j<size;j++)
            {
                query[i][j]=Integer.parseInt(s[j]);
            }
            int sq=query[i][0];
            int elem=query[i][1];
            int qi=query[i][2];

            if(sq==1 && elem!=-1 && qi !=-1)
            {
                kQueue.enqueue(elem, qi);
            }
            else if(sq ==2 && elem!=-1 && qi==-1)
            {
                System.out.println(kQueue.dequeue(elem));
            }
            else
            {
                if(sq==3)
                {
                    System.out.println(kQueue.isEmpty(elem));
                }
                else if(sq==4)
                {
                    System.out.println(kQueue.isFull());
                }
            }
        }
        


    }
}

class KQueue{

    int[] arr;
    int[] front;
    int[] rear;
    int[] next;
    int free;
    int n,k;
    KQueue(int n,int k)
    {
        this.n=n;
        this.k=k;
        arr=new int[n];
        front=new int[k];
        rear=new int[k];
        next=new int[n];
        free=0;
        //initialize front and rear
        for(int i=0;i<k;i++)
        {
            front[i]=rear[i]=-1;
        }
        //Initialize free list
        for(int i=0;i<n-1;i++)
        {
            next[i]=i+1;
        }
        next[n-1]=-1;

    }

    void enqueue(int x, int i)
    {
        if(free==-1) return; //Overflow
        int index=free;
        free=next[index];
        arr[index]=x;

        if(front[i]==-1)
        {
            front[i]=index;
        }
        else{
            next[rear[i]]=index;
        }
        next[index]=-1;
        rear[i]=index;
    }

    int dequeue(int i) {
        if(front[i]==-1) return -1; //underflow
        int index=front[i];
        front[i]=next[index];
        next[index]=free;
        free=index;

        return arr[index];
    }
    boolean isEmpty(int i) {
        // check if queue i is empty
        return front[i]==-1;

    }

    boolean isFull() {
        // check if array is full
        return free==-1;
    }



}
