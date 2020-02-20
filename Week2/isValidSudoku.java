public boolean isValidSudoku(char[][] board) {
    if(board.length != 9 && board[0].length != 9){
        return false;
    }
    Map<Integer, Set<Character>> rows = new HashMap<>();
    Map<Integer, Set<Character>> cols = new HashMap<>();
    Map<String, Set<Character>> boxes = new HashMap<>();
    
    for (int row = 0; row < board.length; row++)
    {
        for (int col = 0; col < board[0].length; col++)
        {
            if (board[row][col] != '.')
            {
                Character c = board[row][col];
                if (rows.get(row) != null && rows.get(row).contains(c))
                    return false;
                rows.putIfAbsent(row, new HashSet<>());
                rows.get(row).add(c);
                
                if (cols.get(col) != null && cols.get(col).contains(c))
                    return false;
                cols.putIfAbsent(col, new HashSet<>());
                cols.get(col).add(c);
                
                String keySubBox = String.valueOf(row / 3) + String.valueOf(col / 3);
                if (boxes.get(keySubBox) != null && boxes.get(keySubBox).contains(c))
                    return false;
                boxes.putIfAbsent(keySubBox, new HashSet<>());
                boxes.get(keySubBox).add(c);
            }
        }
    }
        
    return true;
        
}