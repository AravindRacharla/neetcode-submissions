class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength =0,i=0;
int n = s.length();
int j=0;
Set<Character> set = new HashSet<>();
       while(i<n){
            
            char ch = s.charAt(i);
            int currentLength =0;
            while(set.contains(ch)){
               set.remove(s.charAt(j));
               j++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength,i-j+1);
            i++;

        }
        return maxLength;
        
    }
}
