class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1Map = new HashMap<>();
        Map<Character,Integer> s2Map = new HashMap<>();
        for(char ch : s1.toCharArray()){
        s1Map.put(ch,s1Map.getOrDefault(ch,0)+1);
        }
        int n = s2.length();
        int k = s1.length();
        if(k>n){
            return false;
        }
        for(int i=0;i<k;i++){
            char ch = s2.charAt(i);
            s2Map.put(ch,s2Map.getOrDefault(ch,0)+1);
        }
        if(s1Map.equals(s2Map)){
            return true;
        }
        for(int i=k;i<n;i++){
            char ch1 = s2.charAt(i);
            int j = i-k;
            char ch2 = s2.charAt(j);
            if(s2Map.get(ch2)==1){
                s2Map.remove(ch2);
            }else{
            s2Map.put(ch2, s2Map.get(ch2)-1);
            }
            s2Map.put(ch1,s2Map.getOrDefault(ch1,0)+1);
            if(s1Map.equals(s2Map)){
                return true;
            }
        }
        return false;

        
    }
}
