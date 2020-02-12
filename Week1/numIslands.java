public int numIslands(char[][] grid) {
    if(grid == null || grid.length == 0){
        return 0;
    }
    
    int numIsland = 0;
    for(int i = 0; i < grid.length;i++){
        for(int j = 0; j < grid[0].length; j++){
            if(grid[i][j] == '1'){
                numIsland += dfs(grid, i, j);
            }
        }
    }
    return numIsland;
}

public int dfs(char[][] m, int x, int y){
    if(x < 0 || x >= m.length || y < 0 || y >= m[0].length || m[x][y] == '0'){
        return 0;
    }
    m[x][y] = '0';
    dfs(m, x + 1, y);
    dfs(m, x - 1, y);
    dfs(m, x, y +1);
    dfs(m, x, y - 1);
    return 1;
    
}