class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String s : strs){
            for(char ch : s.toCharArray()){
                if(ch == '/'){
                    sb.append("//");
                }else if(ch == ';'){
                    sb.append("/;");
                }else{
                    sb.append(ch);
                }
            }
            sb.append(';'); 
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> s = new ArrayList<>();
        int i=0;
        StringBuffer sb = new StringBuffer();
        while(i<str.length()){
            if(str.charAt(i)=='/'){
                sb.append(str.charAt(i+1));
                i=i+1;
            }else if(str.charAt(i)!=';'){
                sb.append(str.charAt(i));
            }else{
                s.add(sb.toString());
                sb = new StringBuffer();
            }
            i++;
        }
        return s;
    }
}
