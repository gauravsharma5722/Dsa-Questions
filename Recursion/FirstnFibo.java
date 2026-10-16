import java.util.Scanner;
import java.util.ArrayList;
class FirstnFibo{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(firstNFibo(n));
    }
    static ArrayList<Integer> firstNFibo(int n)
    {
        if(n==1)
        {
            ArrayList<Integer> res=new ArrayList<>();
            res.add(0);
            return res;
        }
        if(n==2)
        {
            ArrayList<Integer> res=new ArrayList<>();
            res.add(0);
            res.add(1);
            return res;
        }
        ArrayList<Integer> res=firstNFibo(n-1);
        
        int next=res.get(res.size()-1)+res.get(res.size()-2);
        res.add(next);
        return res;
        
    }
}