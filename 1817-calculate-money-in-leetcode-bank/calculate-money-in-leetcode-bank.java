class Solution {
    public int totalMoney(int n) {
        int dol = 1;
        int reset = 1;
        int ans = 0;
        int day = 0;

        while (n > 0) {
            ans += dol;
            dol++;
            n--;
            day++;

            if (day % 7 == 0) {
                reset++;
                dol = reset;
            }
        }
        return ans;
    }
}
