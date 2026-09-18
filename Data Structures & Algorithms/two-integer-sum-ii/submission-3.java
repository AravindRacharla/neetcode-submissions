class Solution {
    public int[] twoSum(int[] numbers, int target) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int i =0;i<numbers.length;i++){
        int diff = target - numbers[i];
        if(map.containsKey(diff)){
            int j = map.get(diff);
            return new int[]{j,i+1};
        }
        map.put(numbers[i],i+1);
    }
     return new int[]{};   
    }
}
