class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length == 1)return 1;
        for(int val: nums){
            if(!map.containsKey(val)){
                map.put(val,1);
            }
            else {
                int freq = map.get(val);
                map.put(val,freq+1);
            }
        }
        int freq =0;
        int result = 0;
        for(int val :map.keySet()){
            int newFreq = map.get(val);

            if(newFreq > freq){
                freq = newFreq;
                result = newFreq;      // reset count
            }
            else if(newFreq == freq){
                result += newFreq;     // add its frequency
            }
        }
        
        return result;
    }
}