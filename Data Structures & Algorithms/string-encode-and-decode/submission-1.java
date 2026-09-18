class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)==':'){
                    sb.append("/:");
                }else if(s.charAt(i)=='/'){
                    sb.append("//");
                }else{
                    sb.append(s.charAt(i));
                }
            }
             sb.append(":");
        }
        return sb.toString();
    }
    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int n = str.length();
        int i=0;
        while(i<n)
        {
            if(str.charAt(i)=='/'){
                sb.append(str.charAt(i+1));
                i= i+2;
            }else if(str.charAt(i) != ':'){
                sb.append(str.charAt(i));
                i++;
            }else{
                list.add(sb.toString());
                sb = new StringBuilder();
                i++;
            }
        }
        return list;

    }
}
