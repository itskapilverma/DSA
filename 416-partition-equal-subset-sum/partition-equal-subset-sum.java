class Solution {
    
    boolean search(int nums[],int sum,int i,Boolean dp[][]){
        if(sum == 0)return true;
        
        if(i == nums.length || sum<0)return false;
        if(dp[i][sum] != null)return dp[i][sum];
        return dp[i][sum] = search(nums,sum-nums[i],i+1,dp)||search(nums,sum,i+1,dp);
       
        
    }
    public boolean canPartition(int[] nums) {
        int sum  = 0;
        for(int i =0; i<nums.length;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0)return false;
        Boolean dp[][] = new Boolean[nums.length][sum+1];
        return search(nums,sum/2,0,dp);
    }
}