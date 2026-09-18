class Solution {
    public int characterReplacement(String s, int k) {
        
 HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int maxF = 0;
        int maxL = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxF = Math.max(maxF, hm.get(ch));

            // shrink until window is valid
            while ((r - l + 1) - maxF > k) {
                char ch1 = s.charAt(l);
                hm.put(ch1, hm.get(ch1) - 1);
                if (hm.get(ch1) == 0) hm.remove(ch1);
                l++;
            }

            // update answer (IMPORTANT)
            maxL = Math.max(maxL, r - l + 1);
        }
        return maxL;
    }
}
