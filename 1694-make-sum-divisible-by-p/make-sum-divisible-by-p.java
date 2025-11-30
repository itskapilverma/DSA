class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        int n=nums.length;
        int min=n;
        for(int i=0;i<n;i++){
            sum=(sum+nums[i])%p;
        }
        int target=sum%p;
        if(target==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=0;
        map.put(curr,-1);
        for(int j=0;j<n;j++){
            curr=(curr+nums[j])%p;
            int find=(curr-target+p)%p;
            if(map.get(find)!=null){
                min=Math.min(min,j-map.get(find));
            }
            map.put(curr,j);
        }
        return min==n?-1:min;
    }
}