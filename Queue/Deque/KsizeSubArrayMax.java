import java.util.*;

class KsizeSubArrayMax {
    public ArrayList<Integer> maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            //Remove the elements outer then the window
            while(!dq.isEmpty() && i-dq.peekFirst()>=k)
            {
                dq.pollFirst();
            }
            //Remove the smaller elements in the window
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i])
            {
                dq.pollLast();
            }
            dq.offerLast(i);
            //Add the maximum element of the window to the answer
            if(i>=k-1)
            {
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        KsizeSubArrayMax obj = new KsizeSubArrayMax();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> result = obj.maxSlidingWindow(arr, k);
        System.out.println(result); // Expected output: [3, 3, 5, 5, 6, 7]
    }
}