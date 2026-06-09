class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            max =Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        long dif = max - min;
        return dif*k;
    }
}