public class PrintLinearly1ton {
    static int i=1;
    public static void main(String[] args) {
        printLinearly1ton(5);
    }
    public static void printLinearly1ton(int n)
    {
        if(i>n)
        return;
        System.out.println(i);
        i++;
        printLinearly1ton(n);
        
    }
}
