class Solution {
    public int totalMoney(int n) {
        int weekStart = 1;  
        int ans = 0;

        while (n > 0) {
            for (int day = 0; day < 7 && n > 0; day++) {
                ans += weekStart + day;
                n--;
            }
            weekStart++;
        }
        return ans;
    }
}
