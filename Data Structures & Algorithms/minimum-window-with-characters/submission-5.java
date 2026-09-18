class Solution {
    public String minWindow(String s, String t) {
      if(t.isEmpty()){
        return "";
      } 
      Map<Character,Integer> sMap = new HashMap<>();
      Map<Character,Integer> tMap = new HashMap<>();
      for(char ch : t.toCharArray()){
        tMap.put(ch,tMap.getOrDefault(ch,0)+1);
      }
      int totalCount = tMap.size();
      int m=0,n=0,count=0;
      int minLength = 9999999;
      int i=0,j=0;
      while(j<s.length()){
        char ch = s.charAt(j);
        sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        if(tMap.containsKey(ch) && tMap.get(ch).equals(sMap.get(ch))){
            count++;
        }
        while(totalCount == count){
            if(minLength>(j-i+1)){
                m=i;
                n=j;
                minLength = (j-i+1);
            }
            char ch1 = s.charAt(i);
                sMap.put(ch1,sMap.get(ch1)-1);
            
            if(tMap.containsKey(ch1) && sMap.get(ch1)<(tMap.get(ch1))){
                count--;
            }
            i++;
        }
        j++;
      }
      return minLength == 9999999?"":s.substring(m,n+1);
          }
}
