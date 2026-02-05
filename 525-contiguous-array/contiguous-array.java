class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n=nums.length;
        int sum=0;
        int maxLen=0;
        mp.put(0,-1);
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }

            if (mp.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - mp.get(sum));
            } 
            else {
                mp.put(sum, i);
            }
        }
        return maxLen;
    }
}