class Solution {
    public int characterReplacement(String s, int k) {
        
 HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0,j=0;
        int maxFreq = 0;
        int maxLen = 0;
      while(j<s.length()){
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, hm.get(ch));

            // shrink until window is valid
            while ((j - i + 1) - maxFreq > k) {
                char ch1 = s.charAt(i);
                hm.put(ch1, hm.get(ch1) - 1);
                if (hm.get(ch1) == 0) hm.remove(ch1);
                i++;
            }

            // update answer (IMPORTANT)
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }
}
