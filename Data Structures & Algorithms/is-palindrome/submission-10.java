class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()|| s.length()==0){
            return true;
        }
        int n=s.length();
        int i=0,j=n-1;
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
