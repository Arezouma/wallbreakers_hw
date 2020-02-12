public int[][] flipAndInvertImage(int[][] A) {
        
    for(int i = 0; i < A.length; i++){
        for(int j = 0; j < A[0].length/2; j++){
            int temp = A[i][j];
            A[i][j] = A[i][A[0].length -j-1];
            A[i][A[0].length -j-1] = temp;
            
        }
        
        for(int x = 0; x < A[i].length; x++){
            A[i][x] = (A[i][x] == 1) ? 0 : 1;
        }
    }
    return A;
        
}