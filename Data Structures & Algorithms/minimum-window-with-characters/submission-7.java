class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }
        int len = tMap.size();
        int i=0,j=0,count=0;
        int n = s.length();
        int minWindow = Integer.MAX_VALUE;
        int n1=0,n2=0;
        while(j<n){
            char ch = s.charAt(j);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
            if(tMap.containsKey(ch) && tMap.get(ch)== sMap.get(ch)){
                count++;
            }
            while(count ==len){
                char ch1 = s.charAt(i);
                if(j-i+1 < minWindow){
                    n1=i;
                    n2=j;
                    minWindow = j-i+1;
                }
                sMap.put(ch1,sMap.get(ch1)-1);
                if(tMap.containsKey(ch1) && sMap.get(ch1)<tMap.get(ch1)){
                    count--;
                }
                i++;

            }
          //  minWindow = Math.min(minWindow,j-i+1);
            j++;
        }
        return minWindow == Integer.MAX_VALUE?"":s.substring(n1,n2+1);   
    }
}
