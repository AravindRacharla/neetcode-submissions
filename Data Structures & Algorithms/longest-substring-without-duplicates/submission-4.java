class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0,j=0;
        int longestLength=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch) && i<j){
                char ch1 = s.charAt(i);
                set.remove(ch1);
                i++;
            }
            set.add(ch);
            longestLength = Math.max(longestLength,(j-i+1));
            j++;
        }
        return longestLength;
    }
}
