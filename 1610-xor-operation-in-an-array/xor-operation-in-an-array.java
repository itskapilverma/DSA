class Solution {
    public int xorOperation(int n, int start) {
        int sum = start;
        for(int i=1; i<n; i++){
            sum = sum ^ (start + 2 * i);
        }
        return sum;
    }
}