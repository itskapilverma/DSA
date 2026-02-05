class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n= nums.length;
        int left = 0;
        long rep = 0, res = 0;

        for (int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        } 

        for (int i=0; i<n; i++) {
            if (nums[i] == max) {
                rep++;
            }
            while (rep >= k) {
                if (nums[left] == max) rep--;
                left++;
            }
            res += left;
        }
        return res;
    }
}