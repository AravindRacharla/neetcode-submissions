class Solution {
    public int lengthOfLongestSubstring(String s) {
          int i =0,j=0;
        int n = s.length();
        int length=0;
        Set<Character> set = new HashSet<>();
        while(j<n){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                char ch1 =s.charAt(i);
                set.remove(ch1);
                i++;
            }
            set.add(ch);
            length = Math.max(length,j-i+1);
              j++;
           // System.out.println(s.substring(i,j));
        }
        return length;
    }
}
