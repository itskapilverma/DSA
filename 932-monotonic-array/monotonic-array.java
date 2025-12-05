class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean Inc = true;
        boolean Dec = true;

        for (int i = 1; i < n; i++) {
            if (!Inc && !Dec) {
                return false;
            }

            if (nums[i] < nums[i - 1]) {
                Inc = false;
            }
            if (nums[i] > nums[i - 1]) {
                Dec = false;
            }
        }

        return Inc || Dec;        
    }
}