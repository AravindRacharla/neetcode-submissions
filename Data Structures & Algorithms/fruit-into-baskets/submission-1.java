class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0,j=0;
        int n = fruits.length;
        int maxLength=0;
        while(j<n){
            int a = fruits[j];
            map.put(a,map.getOrDefault(a,0)+1);
            while(map.size()>2){
                int b = fruits[i];
                map.put(b,map.get(b)-1);
                if(map.get(b)==0){
                    map.remove(b);
                }
                i++;
            }
            maxLength = Math.max(maxLength,j-i+1);
            j++;

        }
        return maxLength;
       
    }
}