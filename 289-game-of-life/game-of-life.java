class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                copy[i][j] = board[i][j];
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {

                        if (r >= 0 && r < m && c >= 0 && c < n) {
                            if (r == i && c == j)
                                continue;

                            live += copy[r][c];
                        }
                    }
                }

                if (copy[i][j] == 1) {

                    if (live < 2) board[i][j] = 0;
                    else if (live == 2 || live == 3) board[i][j] = 1;
                    else board[i][j] = 0;

                } else {
                    if (live == 3) board[i][j] = 1;
                    else board[i][j] = 0;
                }

            }
        }

    }
}