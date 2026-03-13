class Solution {

    // DSU Implementation
    int[] parent;
    int[] size;
    public void init(int n){
        parent = new int[n];
        size = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    public int find(int x){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }
    public void union(int a, int b){
        int parentA = find(a);
        int parentB = find(b);

        if(size[parentA]>=size[parentB]){
            parent[parentB] = parentA;
            size[parentA] += size[parentB];
        }else{
            parent[parentA] = parentB;
            size[parentB] += size[parentA];
        }
    }

    public boolean isPath(int a, int b){
        // there exist a path a and be belongs to same parent
        int parentA = find(a);
        int parentB = find(b);
        return parentA==parentB;
    }

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        boolean[] res = new boolean[queries.length]; // result arr
        init(n); // initialize DSU

        Arrays.sort(edgeList, (a, b) -> a[2]-b[2]); // sort by asc order of dist

        // Created new Q for queries so that we can map results of queries to its original indices (As, sorting will change the order)
        int[][] Q = new int[queries.length][4];
        for(int i=0; i<queries.length; i++){
            Q[i][0] = queries[i][0]; // u
            Q[i][1] = queries[i][1]; // v
            Q[i][2] = queries[i][2]; // dist
            Q[i][3] = i; // original index
        }
        Arrays.sort(Q, (a, b) -> a[2]-b[2]); // sort by asc order of limit

        int i=0; // edges iterator
        for(int[] q : Q){ // queries
            int pj = q[0]; // p
            int qj = q[1]; // q
            int limit = q[2];

            while(i<edgeList.length && edgeList[i][2]<limit){ // if this edge has dist under limit
                int u = edgeList[i][0];
                int v = edgeList[i][1];
                int d = edgeList[i][2];

                if(d<limit) union(u, v); // add it to the DSU graph

                i++; // check next edge
            }

            if(isPath(pj, qj)) res[q[3]] = true; // if there exist a path => update res
        }
        return res;
    }
}