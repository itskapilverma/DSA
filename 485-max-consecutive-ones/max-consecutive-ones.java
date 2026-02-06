class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int ans=0;
        int i=0;

        while(i<n){
            if(nums[i]==1){
                int cnt=1;
                while(i+1<n && nums[i]==nums[i+1]){
                    cnt++;
                    i++;
                }
                ans = Math.max(ans,cnt);
            }
            i++;
        }
        return ans;
    }
}