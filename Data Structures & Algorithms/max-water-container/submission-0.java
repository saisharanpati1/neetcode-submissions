class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int lv=heights[0];
        int rv=heights[right];
        int max=0;
    
    while(left<right){
        lv=heights[left];
        rv=heights[right];
        int min = Math.min(lv,rv);
        int mul = (right-left)*min;
        max=Math.max(max,mul);
        if(lv>rv){
            right--;
            continue;
        }
        else{
            left++;
        }
        
    }
    return max;
}
}
