class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
       int[] result = new int[n-k+1];
       if(nums==null || k>n || k<0){
        return result;
       }
       Deque<Integer> dq = new ArrayDeque<>();
       int count=0;
       for(int i=0;i<n;i++){
        //Remove indices out of current window
        while(!dq.isEmpty() && dq.peekFirst() <= i-k){
            dq.pollFirst();
        }
        //Maintain decreasing order pop samller or equal elements from back
        while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
            dq.pollLast();
        }
        dq.offerLast(i);
        //record max when first window completes
        if(i>=k-1){
            result[count++]=nums[dq.peekFirst()];
        }
       }
        return result;
    }
}
