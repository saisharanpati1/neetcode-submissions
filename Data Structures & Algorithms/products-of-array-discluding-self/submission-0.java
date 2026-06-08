class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans =new int[nums.length];
        int product=1;
        int zeroCount=0;
        int zind=-1;
        
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                zind=i;
          
            continue;
              }
            product=product*nums[i];
        }
        if(zeroCount == 1){
            for(int i =0;i<nums.length;i++){
                if(i==zind)ans[i]=product;
                else ans[i]=0;
            }
        }
        else if(zeroCount > 1){
            return ans;
        }
        else{
        for(int i=0;i<nums.length;i++){
            ans[i]=product/nums[i];
        }
        }
        return ans;
    }
}