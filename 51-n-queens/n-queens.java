class Solution {

    public void solve(int r, int n, char[][] board, boolean[] col, boolean[] d1, boolean[] d2, List<List<String>> res) {
        if(r == n){
            List<String> list = new ArrayList<>();

            for(char[] row : board) list.add(new String(row));

            res.add(list);
            return;
        }

        for(int c = 0; c < n; c++){
            int x = r + c, y = r - c + n;

            if(col[c] || d1[x] || d2[y]) continue;

            board[r][c] = 'Q';
            col[c] = d1[x] = d2[y] = true;

            solve(r + 1, n, board, col, d1, d2, res);

            board[r][c] = '.';
            col[c] = d1[x] = d2[y] = false;

        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];
        boolean[] col = new boolean[n];
        boolean[] d1 = new boolean[2 * n];
        boolean[] d2 = new boolean[2 * n];

        for(char[] row : board) Arrays.fill(row, '.');

        solve(0, n, board, col, d1, d2, res);

        return res;
    }
}