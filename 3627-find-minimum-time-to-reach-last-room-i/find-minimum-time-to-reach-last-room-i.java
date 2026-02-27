class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n=moveTime.length,m=moveTime[0].length;
        int[][] grid=new int[n][m];
        for(int r[]:grid)Arrays.fill(r,Integer.MAX_VALUE);
        grid[0][0]=0;
        int[] r={-1,1,0,0},c={0,0,1,-1};
        Queue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int[]{0,0,0});//time,row,col
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int time=curr[0],rr=curr[1],cc=curr[2];
            if(rr==n-1&&cc==m-1)return time;
            for(int i=0;i<4;i++){
                int nr=r[i]+rr,nc=c[i]+cc;{
                    if(nr>=0&&nr<n&&nc>=0&&nc<m){
                        int newtime=Math.max(time+1,moveTime[nr][nc]+1);
                        if(newtime<grid[nr][nc]){
                            grid[nr][nc]=newtime;
                            pq.add(new int[]{newtime,nr,nc});
                        }
                        
                    }
                }
                
            }
        }return 0;
    }
}