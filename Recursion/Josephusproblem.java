class Josephusproblem {
    
    static int josephus(int n, int k) {
        if (n == 1)
            return 0; 
        else
            return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 7; 
        int k = 3; 

        
        int result = josephus(n, k);

        
        System.out.println("The position of the last person remaining is: " + (result + 1));
    }
}