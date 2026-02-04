class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);

        int total = 0, count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            total += nums[i];

            if (subNum.containsKey(total - goal)) {
                count += subNum.get(total - goal);
            }

            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }
        return count;
    }
}