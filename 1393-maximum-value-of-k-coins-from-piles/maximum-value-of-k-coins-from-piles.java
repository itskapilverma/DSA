class Solution {
    public int solve(int i, int k, int n, List<List<Integer>> piles, int[][] dp){
        if(i >= n || k == 0) return 0;

        if(dp[i][k] != -1) return dp[i][k];

        int ans = 0;

        ans = solve(i+1, k, n, piles, dp);

        for(int j = 0; j < piles.get(i).size(); j++){
            int sum = piles.get(i).get(j);

            if(k >= j+1){
                ans = Math.max(ans, sum + solve(i+1, k-(j+1), n, piles, dp));
            }
        }

        return dp[i][k] = ans;
    }
    
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();

        for(List<Integer> pile : piles){
            for(int i = 1; i < pile.size(); i++){
                pile.set(i, pile.get(i) + pile.get(i-1));
            }
        }

        int[][] dp = new int[n][k+1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(0, k, n, piles, dp);
    }
}