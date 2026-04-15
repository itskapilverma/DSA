class Solution {
    int solve(int x){
        int cnt=0;

        while(x>0){
            cnt+=x & 1;
            x>>=1;
        }
        return cnt;
    }

    public int[] countBits(int n) {
        int[] res = new int[n+1];

        for(int i=0; i<n+1; i++){
            res[i]+=solve(i);
        }
        return res;
    }
}