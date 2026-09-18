class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0,n=s.length(),maxLength=0,maxFreq = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(j<n){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,map.get(ch));
            while(i<n && (j-i+1) - maxFreq >k){
                char ch1 = s.charAt(i);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0){
                    map.remove(ch1);
                }
                i++;
            }
            maxLength = Math.max(maxLength,(j-i+1));
            j++;
        }
        return maxLength;
 
    }
}
