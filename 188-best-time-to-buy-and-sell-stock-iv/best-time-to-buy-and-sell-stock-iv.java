class Solution {
    int n;
    int dp[][][];

    public int helper(int idx, int buy, int k, int t, int[] prices){
        if(idx == n || t == k){
            return 0;
        }

        if(dp[idx][buy][t] != -1) return dp[idx][buy][t];

        int profit;

        if(buy == 1){
            int buyStock = -prices[idx] + helper(idx + 1, 0, k, t, prices);
            int skip = helper(idx + 1, 1, k, t, prices);
            profit = Math.max(buyStock, skip);
        } else {
            int sellStock = prices[idx] + helper(idx + 1, 1, k, t + 1, prices);
            int skip = helper(idx + 1, 0, k, t, prices);
            profit = Math.max(sellStock, skip);
        }

        return dp[idx][buy][t] = profit;
    }

    public int maxProfit(int k, int[] prices) {
        n = prices.length;
        dp = new int[n][2][k];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                for(int t = 0; t < k; t++){
                    dp[i][j][t] = -1;
                }
            }
        }

        return helper(0, 1, k, 0, prices);
    }
}