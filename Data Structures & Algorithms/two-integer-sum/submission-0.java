class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> values = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(values.containsKey(diff)){
                int j = values.get(diff);
                return new int[]{j,i};
            }
            values.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
