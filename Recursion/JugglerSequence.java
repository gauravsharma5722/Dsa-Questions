import java.util.*;
class JuggleSequence{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(jugglerSequence(n));
    }

     static List<Integer> jugglerSequence(int n) {
        // code here
        List<Integer> res=new ArrayList<>();
        sequence(res,n);
        return res;
    }
    static void sequence(List<Integer> res,int n)
    {
        if(n==1)
        {
            res.add(n);
            return;
        }
        res.add(n);
        System.out.println(n);
        if(n%2==0)
        {
            n= (int)Math.floor(Math.pow(n,0.5));
            sequence(res,n);
            return;
            
        }
        
        
            n=(int)Math.floor(Math.pow(n,1.5));
            sequence(res,n);
            return;
        
        
    }
}