import java.util.Scanner;

public class BuySellStock {


    public static int maxProfit(int[] prices) {
        // Code here
       int min=Integer.MAX_VALUE,minin=0,max=Integer.MIN_VALUE,maxin=0;
        int n=prices.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min){
                min=prices[i];
                minin=i;
            }
            if(maxin <minin)
            {
                max=0;
            }
            if(prices[i]>max){
                max=prices[i];
                maxin=i;
            }
            if(min<max && minin<maxin)
            {
            
            ans=Math.max(max-min,ans);
            }
            
        }
       
        
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
            String[] s=sc.nextLine().split(" ");
            int n=s.length;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(s[i]);
            }


            System.out.println("Maximum Profit is: " + maxProfit(arr));
    
    }

}
