class Solution {
    int solve(String s, char c, int k){
        int i=0, j=0;
        int ans=0;
        int cnt=0;
        int n=s.length();
        while(j<n){
            if(s.charAt(j)!=c){
                cnt++;
            }
            while(cnt>k){
                if(s.charAt(i)!=c){
                    cnt--;
                }

                i++;
            }
            ans= Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }

    public int maxConsecutiveAnswers(String string, int k) {
        int n=string.length();
        int opt1 = solve(string, 'T', k);
        int opt2 = solve(string, 'F', k);
        int result = Math.max(opt1,opt2);
        return result;
    }
}