public int findCircleNum(int[][] M) {
    int count = 0;
    for(int[] row : M)
    {
        int friends = dfs(row, M);
        if(friends > 0) 
            count++;
    }
    return count;
}

public int dfs(int[] row, int[][] M)
{
    int friends = 0;
    for(int i = 0; i < row.length; i++)
    {
        if(row[i] == 1)
        {
            row[i] = 0;
            friends += dfs(M[i], M);
            friends++;
        } 
    }
    return friends;
}