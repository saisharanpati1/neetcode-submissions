class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>hset = new HashSet<>();
        int a=-1;
        for(int i =0;i<nums.length;i++){
            if(hset.contains(nums[i])){
                a=nums[i];
                break;
            }
            else
            hset.add(nums[i]);
        }
        return a;
    }
}
