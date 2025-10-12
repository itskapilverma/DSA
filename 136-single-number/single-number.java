class Solution {
    public int singleNumber(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1) return arr[i];
        }
        return -1; // Error/sentinel
    }
}