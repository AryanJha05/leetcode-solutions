class Solution {

    public int dfs(int i, int j, int[][] grid, boolean[][] vis){
        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0 || vis[i][j]) return 0;

        vis[i][j] = true;

        int cnt = grid[i][j];

        cnt += dfs(i, j + 1, grid, vis);
        cnt += dfs(i, j - 1, grid, vis);
        cnt += dfs(i + 1, j, grid, vis);
        cnt += dfs(i - 1, j, grid, vis);

        return cnt;
    }

    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];

        int res = 0;

        for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) if(grid[i][j] > 0 && !vis[i][j]) res = Math.max(res, dfs(i, j, grid, vis));

        return res;
    }
}