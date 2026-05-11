class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int val = nums[i];
            while (val > 0) {
                temp.add(val % 10);
                val /= 10;
            }
        }
        Collections.reverse(temp);
        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}