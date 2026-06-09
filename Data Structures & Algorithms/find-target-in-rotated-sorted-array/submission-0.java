class Solution {
    public int search(int[] nums, int target) {
       int pivotindex=pivot(nums);
       int ans1=-1;
       int ans2=-1;
    //    if(pivotindex!=-1){
        ans1=bs(nums,target,0,pivotindex);
        ans2=bs(nums,target,pivotindex+1,nums.length-1);
    //    } else {
        // return bs(nums, target, 0, nums.length - 1);
    //    }
       if(ans1!=-1)return ans1;
       return ans2;
    }

     public static int pivot(int[] nums){
         int start=0;
        int end=nums.length-1;
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < nums.length - 1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > 0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return -1;
        }
        public static int bs(int nums[],int target,int start,int end){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]>target){
                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
}