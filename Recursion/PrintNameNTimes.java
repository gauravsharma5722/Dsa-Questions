import java.util.Scanner;
public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter the number of times you want to print your name: ");
        int n=sc.nextInt();
        printNameNtimes(name,n);
    }

    public static void printNameNtimes(String name,int n)
    { 
        if(n==0)
        return;
        
        printNameNtimes(name,n-1);
        System.out.println(name+" "+n);

    }
}
