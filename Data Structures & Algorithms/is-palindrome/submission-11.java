class Solution {
    public boolean isPalindrome(String s) {
        int i =0;
        int j= s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
             while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            char ch = Character.toLowerCase(s.charAt(i));
            char ch1 = Character.toLowerCase(s.charAt(j));
            if(ch!=ch1){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
