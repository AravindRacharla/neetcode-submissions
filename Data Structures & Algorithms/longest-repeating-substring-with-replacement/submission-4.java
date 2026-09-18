class Solution {
    public int characterReplacement(String s, int k) {
 Map<Character,Integer> map = new HashMap<>();
     int i=0,j=0,maxLength=0,maxFreq = 0;
     while(j<s.length()){
         char ch = s.charAt(j);
          map.put(ch,map.getOrDefault(ch,0)+1);
         maxFreq = Math.max(maxFreq , map.get(ch));
         while((j-i+1) - maxFreq > k && i<j){
             char ch1 = s.charAt(i);
             if(map.get(ch1)==1){
                 map.remove(ch1);
             }else{
                 map.put(ch1 , map.get(ch1)-1);
             }
             i++;
         }
         maxLength = Math.max(maxLength,(j-i+1));
       
        j++;
     }
        return maxLength;
    }
}
