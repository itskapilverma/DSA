class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int j=n-1;

        int[] ans = new int[n];

        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[j]=ans[i];
            j--;
        }

        return ans;
    }
}