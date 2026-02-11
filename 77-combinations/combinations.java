class Solution {
    
    public void solve(int start, int n, int k, List<List<Integer>> ans, List<Integer> temp) {
        if (k == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);             
            solve(i + 1, n, k - 1, ans, temp);
            temp.remove(temp.size() - 1);      
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, n, k, ans, new ArrayList<>());
        return ans;
    }

}