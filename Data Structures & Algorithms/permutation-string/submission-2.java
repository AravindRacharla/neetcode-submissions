class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()==0 || s2.length() ==0 || s1.length()>s2.length()){
            return false;
        }
        Map<Character,Integer> s1Map = new HashMap<>();
        Map<Character,Integer> s2Map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            s1Map.put(ch,s1Map.getOrDefault(ch,0)+1);
        }
        System.out.println("s1Map "+ s1Map);
        int n=s1.length();
        for(int i=0;i<n;i++){
            char ch = s2.charAt(i);
            s2Map.put(ch, s2Map.getOrDefault(ch,0)+1);
        }
        System.out.println(s2Map);
        if(s1Map.equals(s2Map)){
            return true;
        }
        for(int i = n;i<s2.length();i++){
            char ch  = s2.charAt(i);
            s2Map.put(ch, s2Map.getOrDefault(ch,0)+1);
            char ch2 = s2.charAt(i-n);
            s2Map.put(ch2,s2Map.get(ch2)-1);
            if(s2Map.get(ch2)==0){
                s2Map.remove(ch2);
            }
            System.out.println("In for loop   " + s2Map);
            if(s1Map.equals(s2Map)){
                return true;
            }
        }
        return false;
        
    }
}
