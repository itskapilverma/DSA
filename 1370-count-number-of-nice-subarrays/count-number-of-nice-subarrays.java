class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        int oddCount = 0;
        int result = 0;

        mp.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0) {
                oddCount++;
            }

            if (mp.containsKey(oddCount - k)) {
                result += mp.get(oddCount - k);
            }

            mp.put(oddCount, mp.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }
}
