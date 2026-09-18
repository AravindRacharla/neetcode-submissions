class Solution {
    public int scoreOfString(String s) {
        int totalDiff = 0;
        for(int i =0;i<s.length()-1;i++){
            int diff = s.charAt(i+1)-s.charAt(i);
            totalDiff += Math.abs(diff);
        }
        return totalDiff;
    }
}