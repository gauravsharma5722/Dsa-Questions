public class FindHindex {
    public static void main(String[] args) {
        int[] arr={3,0,6,1,5};
        System.out.println("H-Index is: " + hIndex(arr));
    }
     public static int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(citations[i]>=n)
            {
                freq[n]++;
            }
            else
            freq[citations[i]]++;
        }
        int Hindex=n;
        int num=freq[n];
        while(num<Hindex)
        {
            Hindex--;
            num+=freq[Hindex];
        }
        return Hindex;
    }
    
}
