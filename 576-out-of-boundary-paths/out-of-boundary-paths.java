class Solution {
    int MOD = 1000000007;
    int[][][] dp;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= maxMove; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return dfs(m, n, maxMove, startRow, startColumn);
    }

    private int dfs(int m, int n, int moves, int row, int col) {
        if (row < 0 || col < 0 || row >= m || col >= n) {
            return 1;
        } 
        else if (moves == 0) {
            return 0;
        } 
        else if (dp[row][col][moves] != -1) {
            return dp[row][col][moves];
        } 
        else {
            int up = dfs(m, n, moves - 1, row - 1, col);
            int down = dfs(m, n, moves - 1, row + 1, col);
            int left = dfs(m, n, moves - 1, row, col - 1);
            int right = dfs(m, n, moves - 1, row, col + 1);

            dp[row][col][moves] = ((up + down) % MOD + (left + right) % MOD) % MOD;
            return dp[row][col][moves];
        }
    }
}