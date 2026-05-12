class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int val = 0;
        for(int i =0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[val];
                nums[val++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}