class Solution {
    public int scoreOfString(String s) {
        int totalDiff = 0;
        for(int i =0;i<s.length()-1;i++){
            int diff = s.charAt(i+1)-s.charAt(i);
            if(diff>=0){
            totalDiff = totalDiff + diff;
            }else{
                totalDiff = totalDiff - diff;
            }
        }
        return totalDiff;
    }
}