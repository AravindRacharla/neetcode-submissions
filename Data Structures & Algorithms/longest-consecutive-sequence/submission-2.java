class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int count=0,maxLen =0;
      //  int i=0;
       for(int i : nums){
            if(!set.contains(i-1)){
                count =1;
                while(set.contains(i+1)){
                    count++;
                    i++;
                }
            }
            maxLen = Math.max(maxLen,count);
            
        }
        return maxLen;
        
    }
}
