class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
            if(target== matrix[i][j])return true;
           }
        }
        return false;
    }
    //  public int search(int[] nums, int target,int start,int end) {
        
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(nums[mid]>target){
    //             end=mid-1;
    //         }
    //         else if(nums[mid]<target){
    //             start=mid+1;
    //         }
    //         else {
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
}
