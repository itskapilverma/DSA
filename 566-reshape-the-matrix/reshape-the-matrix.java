class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length, x = 0, y = 0;

        if (m * n != r * c) return mat;

        int[][] arr = new int[r][c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[x][y] = mat[i][j];
                y++;
                if (y == c) {
                    x++;
                    y = 0;
                }
            }
        }

        return arr;
    }
}