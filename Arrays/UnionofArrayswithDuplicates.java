import java.util.*;
public class UnionofArrayswithDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s1=sc.nextLine().split(" ");
        String[] s2=sc.nextLine().split(" ");
        int[] a=new int[s1.length];
        int[] b=new int[s2.length];
        for(int i=0;i<s1.length;i++)
        {
            a[i]=Integer.parseInt(s1[i]);
        }
        for(int i=0;i<s2.length;i++)
        {
            b[i]=Integer.parseInt(s2[i]);
        }
        System.out.println(findUnion(a, b));
    }
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        TreeSet<Integer> ans=new TreeSet<>();
        for(int i=0;i<a.length;i++)
        {
            ans.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            ans.add(b[i]);
        }
        
        return new ArrayList<>(ans);
        
    }
}
