class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength =0;
        int i=0,j=0,n=s.length();
        Set<Character> set = new HashSet<>();
        while(j<n){
            char ch = s.charAt(j);
            while(i<j && set.contains(ch)){
                char ch1 = s.charAt(i);
                set.remove(ch1);
                i++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}
