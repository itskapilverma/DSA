class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;

        int total=0;

        for(int num:nums){
            total+=num;
        }

        int l=0;

        for(int i=0; i<n; i++){
            if(l==total-l-nums[i]){
                return i;
            }

            l+=nums[i];
        }

        return -1;
    }
}