class MaxCircularSum {
    public static int maxCircularSum(int arr[]) {
        // code here
        int ts=0;
        int cmaxs=0,cmins=0;
        int maxsum=arr[0],minsum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            cmaxs=Math.max(cmaxs+arr[i],arr[i]);
            maxsum=Math.max(maxsum,cmaxs);
            
            cmins=Math.min(cmins+arr[i],arr[i]);
            minsum=Math.min(minsum,cmins);
            
            ts+=arr[i];
            
        }
        int ns=maxsum;
        int cs=ts-minsum;
        
        if(minsum==ts)
        {
            return ns;
        }
        return Math.max(ns,cs);
    }
    
    public static void main(String[] args) {
        int[] arr = {8, -1, 3, 4};
        System.out.println("Maximum Circular Subarray Sum is: " + maxCircularSum(arr)); // Output: 15
    }
}