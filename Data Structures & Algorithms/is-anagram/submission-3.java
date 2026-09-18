class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
          Map<Character,Integer> tMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch :t.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }
        return map.equals(tMap);
    }
}
