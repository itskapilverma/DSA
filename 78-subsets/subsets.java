class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> res=new ArrayList<>();
        int n=a.length;
        for(int mask=0;mask<(1<<n);mask++){
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0) cur.add(a[i]);
            }
            res.add(cur);
        }
        return res;
    }
}