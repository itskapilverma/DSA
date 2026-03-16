class Solution {
    static int dp[][];

    public int solve(int i, int prev, int[] a){
        if(i>=a.length) return 0;
        if(dp[i][prev+1] != -1) return dp[i][prev+1];

        int pick=0, notpick=solve(i+1, prev, a);

        if(prev == -1 || a[prev]<a[i]) pick=1+solve(i+1, i, a);

        return dp[i][prev+1] =  Math.max(pick, notpick);
    }


    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        dp = new int[n+1][n+1];

        for(int[] r: dp){
            Arrays.fill(r, -1);
        }

        return solve(0, -1, nums);
    }
}