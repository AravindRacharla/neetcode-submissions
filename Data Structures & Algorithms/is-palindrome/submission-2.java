class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase().trim();
        int n = str.length();
        if(n>0){
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        }
        return true;
        
    }
}
