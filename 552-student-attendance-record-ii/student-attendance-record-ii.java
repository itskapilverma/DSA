class Solution {
    int MOD = 1000000007;
    int[][][] dp;

    public int solve(int i, int n, int ab, int l) {

        
        if (ab >= 2 || l >= 3) return 0;

        
        if (i >= n) return 1;

        
        if (dp[i][ab][l] != -1) return dp[i][ab][l];

        long ans = 0;

       
        ans += solve(i + 1, n, ab,0);

        
        ans += solve(i + 1, n, ab + 1, 0);

        
        ans += solve(i + 1, n, ab, l + 1);

        return dp[i][ab][l] = (int)(ans % MOD);
    }

    public int checkRecord(int n) {
        dp = new int[n][2][3];

        
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < 2; a++) {
                for (int l = 0; l < 3; l++) {
                    dp[i][a][l] = -1;
                }
            }
        }

        return solve(0, n, 0, 0);
    }
}