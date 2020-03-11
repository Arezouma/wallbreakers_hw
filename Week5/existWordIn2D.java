public boolean exist(char[][] board, String word) {
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[0].length; j++){
            if(dfs(board, word, i, j, 0)){
                return true;
            }
        }
    }
    return false;
}
public boolean dfs(char[][] board, String word, int row, int col, int k){
    if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
        return false;
    }
    if(board[row][col] == word.charAt(k)){
        char temp = board[row][col];
        board[row][col] = '#';
        if(k == word.length() - 1){
            return true;
        }
        else if(dfs(board, word, row-1, col, k+1) ||
               dfs(board, word, row+1, col, k+1) ||
               dfs(board, word, row, col-1, k+1) ||
               dfs(board, word, row, col+1, k+1)){
            return true;
        }
        board[row][col] = temp;
        
    }
    return false;
}