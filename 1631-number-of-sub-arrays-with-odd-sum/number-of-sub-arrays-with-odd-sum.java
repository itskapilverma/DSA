import java.util.HashMap;

class Solution {
    public int numOfSubarrays(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int mod = 1000000007;
        int n=arr.length;
        mp.put(0, 1); 
        mp.put(1, 0); 
        
        int sum = 0;
        int ans = 0;
        
        for (int i=0; i<n; i++) {
            sum += arr[i];
            int parity = sum % 2;
            
            if (parity == 0) {
                ans = (ans + mp.get(1)) % mod;
            } else {
                ans = (ans + mp.get(0)) % mod;
            }
            
            mp.put(parity, mp.get(parity) + 1);
        }
        
        return ans;
    }
}
