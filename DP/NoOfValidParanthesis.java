import java.util.*;
class NoOfValidParanthesis {
    public static int countValidParentheses(int n) {
        // Using dynamic programming to calculate the nth Catalan number 

        if(n%2!=0)
        return 0;
        
        n/=2;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            int in=0;
            int out=i-1;
            while(in<i)
            {
                dp[i]=dp[i]+(dp[in]*dp[out]);
                in++;
                out--;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println("Number of valid parentheses combinations for " + n + " Length : " + countValidParentheses(n));
    }
}