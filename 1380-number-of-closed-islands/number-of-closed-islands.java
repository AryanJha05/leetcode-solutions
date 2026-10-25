class Solution {

    public boolean dfs(int i, int j, int[][] grid){

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return false;

        if(grid[i][j] == 1) return true; 

        grid[i][j] = 1;

        return dfs(i, j - 1, grid) & dfs(i - 1, j, grid) & dfs(i, j + 1, grid) & dfs(i + 1, j, grid);
    }

    public int closedIsland(int[][] grid) {
        
        int res = 0;

        for(int i = 0; i < grid.length; i++) for(int j = 0; j < grid[0].length; j++) if(grid[i][j] == 0 && dfs(i, j, grid)) res++;

        return res;
    }
}