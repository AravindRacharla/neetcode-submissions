class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> sMap = new HashMap<>();
        for(char c : s.toCharArray()){
            sMap.put(c,sMap.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            Integer frequency = sMap.get(c);
            if(frequency == null){
                return false;
            }
            if(frequency == 1){
                sMap.remove(c);
            }else{
                sMap.put(c,frequency-1);
            }
        }
        return true;     
    }
}
