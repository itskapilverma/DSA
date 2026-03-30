class Solution {
    int[][][] dp;

    public int solve(int low, int high, String s, int K){
        if(low > high) return 0;
        if(low == high) return 1;

        if(dp[low][high][K] != -1)
            return dp[low][high][K];

        int diff = Math.abs(s.charAt(low) - s.charAt(high));
        int cost = Math.min(diff, 26 - diff);

        int left = solve(low + 1, high, s, K);
        int right = solve(low, high - 1, s, K);

        int ans = Math.max(left, right);

        if(K >= cost){
            ans = Math.max(ans, 2 + solve(low + 1, high - 1, s, K - cost));
        }

        return dp[low][high][K] = ans;
    }

    public int longestPalindromicSubsequence(String s, int k) {
        int n = s.length();
        dp = new int[n][n][k + 1];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, n - 1, s, k);
    }
}