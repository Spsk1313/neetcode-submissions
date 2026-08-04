class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int width = right - left;
            int area = 0;
            if (heights[left] < heights[right]) {
                area = width * heights[left];
                left++;
            } else {
                area = width * heights[right];
                right--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
