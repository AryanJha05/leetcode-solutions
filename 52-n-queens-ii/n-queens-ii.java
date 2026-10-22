class Solution {

    public int solve(int r, int n, boolean[] col, boolean[] d1, boolean[] d2){
        if(r == n) return 1;

        int cnt = 0;

        for(int c = 0; c < n; c++){
            int x = r + c, y = r - c + n;

            if(col[c] || d1[x] || d2[y]) continue;

            col[c] = d1[x] = d2[y] = true;

            cnt += solve(r + 1, n, col, d1, d2);

            col[c] = d1[x] = d2[y] = false;
        }

        return cnt;
    }

    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] d1 = new boolean[2 * n];
        boolean[] d2 = new boolean[2 * n];

        return solve(0, n, col, d1, d2);
    }
}