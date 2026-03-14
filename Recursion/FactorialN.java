public class FactorialN {
    public static void main(String[] args) {
        int n=7;
        System.out.println(factorialN(n));
    }
    public static int factorialN(int n)
    {
        if(n==0)
        return 1;
        return n*factorialN(n-1);
    }
}
