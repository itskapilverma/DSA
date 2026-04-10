class Solution {

    boolean solve(int i, int[] nums, Boolean[] dp) {
        int n = nums.length;

        if (i >= n) return false;
        if (i == n - 1) return true;

        if (dp[i] != null) {
            return dp[i];
        }

        for (int j = 1; j <= nums[i]; j++) {
            if (solve(i + j, nums, dp)) {
                return dp[i] = true;
            }
        }

        return dp[i] = false;
    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new Boolean[n];
        return solve(0, nums, dp);
    }
}