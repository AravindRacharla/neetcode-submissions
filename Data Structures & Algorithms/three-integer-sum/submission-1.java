class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        int n = nums.length;
        if(n<3){
            return finalList;
        }
        Arrays.sort(nums);
      //  int i =0,k=nums.length-1;
       // int target=0;
       for(int i=0;i<n-2;i++){
      if(i>0 && nums[i] == nums[i-1]){
        continue;
      }
      if(nums[i]>0){
        break;
      }
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    finalList.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    int leftValue = nums[j];
                    int rightValue = nums[k];
                     while(j<k && nums[j] == leftValue){
                      j++;
                     }
                     while(j<k && nums[k]== rightValue){
                        k--;
                     }
                } else if(sum<0){
                    j++;
                } else{
                    k--;
                }
            }

        }

        return finalList;
    }
}
