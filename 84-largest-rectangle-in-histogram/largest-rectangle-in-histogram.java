class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = i;
            while (left[i] > 0 && heights[left[i] - 1] >= heights[i]) {
                left[i] = left[left[i] - 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = i;
            while (right[i] < n - 1 && heights[right[i] + 1] >= heights[i]) {
                right[i] = right[right[i] + 1];
            }
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] + 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}