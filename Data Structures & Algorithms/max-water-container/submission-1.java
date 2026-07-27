class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxarea = 0;
        while(left<right){
            int wid = right-left;
            int height = Math.min(heights[left], heights[right]);
            int area = wid*height;
            maxarea = Math.max(maxarea, area);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}
