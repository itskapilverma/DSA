class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);

        int total = 0, count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            total += nums[i];

            if (subNum.containsKey(total - k)) {
                count += subNum.get(total - k);
            }

            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }
        return count;
    }
}
