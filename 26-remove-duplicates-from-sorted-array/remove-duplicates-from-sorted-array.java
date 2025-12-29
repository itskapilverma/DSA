class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        int index = 0;
        for (int num : uniqueSet) {
            nums[index++] = num;
        }
        return uniqueSet.size();
    }
}
