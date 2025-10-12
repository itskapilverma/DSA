class Solution {
    public int singleNumber(int[] arr) {
        for(int i=0; i<arr.length; i++){
        int result = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    result++;
                }
            }
            if(result==1){
                return arr[i];
            }
        }
        return -1;
    }
}