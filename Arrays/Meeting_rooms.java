import java.util.Arrays;
import java.util.Scanner;

public class Meeting_rooms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        int intervals[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            String[] s=sc.nextLine().split(" ");
            intervals[i][0]=Integer.parseInt(s[0]);
            intervals[i][1]=Integer.parseInt(s[1]);

        }
        
        System.out.println("Is it possible that person can attain the meeting rooms: " + canAttend(intervals));
    }

    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int n=arr.length;
        boolean flag=true;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i][1]>arr[i+1][0])
               flag=false;
        }
        
        return flag;
        
    }
}
