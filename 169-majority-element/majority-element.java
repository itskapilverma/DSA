class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else{
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        int result =nums[0];
        for(int val:map.keySet()){
            int freq = map.get(val);
            if(freq > n/2){
                result = val;
            }
                
        }
        return result;
    }
}