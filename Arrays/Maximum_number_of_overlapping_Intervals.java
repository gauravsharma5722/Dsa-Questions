import java.util.Arrays;
import java.util.Scanner;

public class Maximum_number_of_overlapping_Intervals {
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
            System.out.println("Maximum number of overlapping intervals: " + maxOverlap(intervals));
    }
    public static int maxOverlap(int[][] intervals) {
        int n=intervals.length;
        int count=0;
        int maxCount=0;
        int[] startTimes=new int[n];
        int[] endTimes=new int[n];
        for(int i=0;i<n;i++)
        {
            startTimes[i]=intervals[i][0];
            endTimes[i]=intervals[i][1];
        }
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
        int i=0,j=0;
        while(i<n && j<n)
        {
            if(startTimes[i]<=endTimes[j])
            {
                count++;
                maxCount=Math.max(maxCount, count);
                i++;
            }
            else
            {
                count--;
                j++;
            }
        }
        return maxCount;
    }
}
