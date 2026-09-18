class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            int n = target-numbers[i];
            if(map.containsKey(n)){
                int k1 = map.get(n);
                return new int[]{k1+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }
}
