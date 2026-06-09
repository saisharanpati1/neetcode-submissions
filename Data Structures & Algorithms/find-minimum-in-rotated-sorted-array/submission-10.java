class Solution {
    public int findMin(int[] nums) {

        int min=nums[0];
        int i=0;
     
        while(i<nums.length){
            min=Math.min(min,nums[i]);
            i++;
           
        }
        return min;
    
    }
    
    }