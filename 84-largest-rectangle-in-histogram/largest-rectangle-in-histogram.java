class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int max=0;

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<=n; i++){
            int curr=(i==n)?0:h[i];

            while(!st.isEmpty() && curr < h[st.peek()]){
                int ht=h[st.pop()];
                int w=st.isEmpty()?i:i-st.peek()-1;
                max=Math.max(max,ht*w);
            }
            st.push(i);
        }
        return max;
    }
}