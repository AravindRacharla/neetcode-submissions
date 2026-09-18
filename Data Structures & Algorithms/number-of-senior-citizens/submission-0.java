class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s : details){
          String str = s.substring(11,13);
           if(Integer.parseInt(str)>60){
            count++;
           }
            
        }
       return count;
        
    }
}