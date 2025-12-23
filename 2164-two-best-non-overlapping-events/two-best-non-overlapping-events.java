class Solution {
    public int maxTwoEvents(int[][] events) {

        Arrays.sort(events, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        int maxVal = 0; 
        int ans = 0;    

        for (int[] event : events) {
            int start = event[0];
            int end = event[1];
            int value = event[2];

            while (!pq.isEmpty() && pq.peek()[0] < start) {
                maxVal = Math.max(maxVal, pq.peek()[1]);
                pq.poll();
            }

            ans = Math.max(ans, maxVal + value);

            pq.offer(new int[]{end, value});
        }

        return ans;
    }
}
