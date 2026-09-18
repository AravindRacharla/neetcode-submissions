class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length() == 0 || t.length()>s.length()){
            return "";
        }
       Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        int need = tMap.size();
        int i = 0, j = 0;
        int count = 0;
        int m = 0, n = 0, minLength = Integer.MAX_VALUE;
        while (j < s.length()) {
            char ch = s.charAt(j);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
            if (tMap.containsKey(ch) && tMap.get(ch) == sMap.get(ch)) {
                count++;
            }
            while (count == need) {
                if ((j - i + 1) < minLength) {
                    m = i;
                    n = j;
                    minLength = j - i + 1;
                }
                char ch1 = s.charAt(i);
                sMap.put(ch1, sMap.get(ch1) - 1);
                if (tMap.containsKey(ch1) && tMap.get(ch1)>sMap.get(ch1)) {
                    count--;
                }
                i++;
            }
            j++;

        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(m, n + 1);
          }
}
