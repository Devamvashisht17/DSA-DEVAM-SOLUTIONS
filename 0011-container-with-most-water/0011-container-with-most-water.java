class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int area=Math.min(height[left], height[right])*width;
            maxarea=Math.max(maxarea, area);
            if(height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxarea;
    }
}