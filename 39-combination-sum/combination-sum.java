class Solution {

    public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (ind == arr.length || target < 0) {
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }

        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}
