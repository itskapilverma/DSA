class Solution {
    boolean check(String s, int l, int r){
        while(l<r){
            if(s.charAt(l++) != s.charAt(r--)) return false;

        }

        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();

        String res = "";

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(check(s,i,j) && j-i+1 > res.length()){
                    res=s.substring(i,j+1);
                }
            }
        }

        return res;
    }
}