class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxLength=0;
        for(int i : set){
            int currentLength = 1;
            if(!set.contains(i-1)){
                int current = i;
                while(set.contains(current+1)){
                    currentLength++;
                    current++;
                }
            }
            maxLength = Math.max(currentLength,maxLength);
        }
        return maxLength;
        
    }
}
