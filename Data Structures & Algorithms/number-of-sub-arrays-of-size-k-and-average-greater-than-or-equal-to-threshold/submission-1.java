class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,count=0;
        for(int i =0;i<k;i++){
            sum+=arr[i];
        }
        int avg = sum/k;
        if(avg >= threshold){
            count++;
        }
        int n = arr.length;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            avg = sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;      
    }
}