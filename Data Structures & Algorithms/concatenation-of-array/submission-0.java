class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+n];
        int i=0;
        for(int k : nums){
            arr[i] = k;
            i++;
        }
        int j=0;
        for(int k : nums){
            arr[i]=k;
            i++;
        }
        return arr;
    }
}