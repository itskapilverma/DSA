class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        
        int p=0, n=0;
        for(int i=0; i<nums.length; i=i+2){
            nums[i]=pos.get(p++);
            nums[i+1]=neg.get(n++);
        }
        return nums;
    }
}