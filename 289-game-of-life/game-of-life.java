class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                board[r][c] += neighbors(board, r, c) * 10;
            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                board[r][c] = calculateAliveOrDead(board[r][c]);
            }
        }
    }

    private int neighbors(int[][] board, int r, int c) {
        int res = 0;
        boolean top = r - 1 >= 0;
        boolean bottom = r + 1 < board.length;
        boolean left = c - 1 >= 0;
        boolean right = c + 1 < board[0].length;
        if (top) {
            res += board[r - 1][c] % 10;
            if (left) res += board[r - 1][c - 1] % 10;
            if (right) res += board[r - 1][c + 1] % 10;
        }
        if (bottom) {
            res += board[r + 1][c] % 10;
            if (left) res += board[r + 1][c - 1] % 10;
            if (right) res += board[r + 1][c + 1] % 10;
        }
        if (left) res += board[r][c - 1] % 10;
        if (right) res += board[r][c + 1] % 10;

        return res;
    }

    private int calculateAliveOrDead(int cell) {
        int neighbors = cell / 10;
        boolean alive = cell % 10 == 1;
        if (alive) {
            if (neighbors < 2 || neighbors > 3) return 0;
            return 1;
        }
        if (neighbors == 3) return 1;
        return 0;
    }
}