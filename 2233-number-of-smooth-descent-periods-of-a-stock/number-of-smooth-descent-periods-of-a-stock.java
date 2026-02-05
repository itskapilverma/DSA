class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long ans = 0;
        int i=0, j=0;
        while(j<n){
            if(j-1>=0){
                if(prices[j-1]!=prices[j]+1){
                    i=j;
                }
            }
            ans+= (j-i+1);
            j++;
        }
        return ans;
    }
}
