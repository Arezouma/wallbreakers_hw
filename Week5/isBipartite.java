public boolean isBipartite(int[][] graph) {
    int[] colorArr = new int[graph.length]; 
    
    for (int i = 0; i < graph.length; i++) {
        if (colorArr[i] != 0) 
            continue;
        if (!isBipartiteHelper(graph, i, 1, colorArr)) 
            return false;
    }
   
     return true;
    
}

public boolean isBipartiteHelper(int[][] graph, int index, int color, 
                                       int[] colorArr) {
    
    if(colorArr[index] != 0){
        return colorArr[index] == color;
    }
    colorArr[index] = color;
    
    for(int n : graph[index]){
        if(!isBipartiteHelper(graph, n, -color, colorArr)){
            return false;
        }
    }
    return true; 
}