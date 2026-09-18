class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()){
            return "";
        }
        int i=0,j=0;
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }
        int[] result = {-1,-1};
        int have = 0,need=tMap.size();
        int minWindow = 99999;
        while(j<s.length()){
            char ch = s.charAt(j);
            sMap.put(ch , sMap.getOrDefault(ch,0)+1);
            if(tMap.containsKey(ch) && tMap.get(ch).equals(sMap.get(ch))){
                have++;
            }
            while(have == need){
                if(minWindow> j-i+1){
                    minWindow = j-i+1;
                    result[0]=i;
                    result[1]=j;
                }
                
                char ch1 = s.charAt(i);
                sMap.put(ch1,sMap.get(ch1)-1);
                if(tMap.containsKey(ch1) && sMap.get(ch1)<tMap.get(ch1)){
                    have--;
                }
                i++;
            }
            j++;
        }
        return minWindow== 99999?"":s.substring(result[0],result[1]+1);
        
    }
}
