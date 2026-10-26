class Solution {
    int m , n;

    public long dfs(int i, int j, int[][] grid){

        if(i < 0 || i >= m || j < 0 || j >= n) return 0;

        if(grid[i][j] == 0) return 0;

        int val = grid[i][j];
        grid[i][j] = 0;

        return val + dfs(i, j - 1, grid) + dfs(i - 1, j, grid) + dfs(i, j + 1, grid) + dfs(i + 1, j, grid);
    }
 
    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int res = 0;

        for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) if(grid[i][j] != 0 && dfs(i, j, grid) % k == 0) res++;

        return res;        
    }
}