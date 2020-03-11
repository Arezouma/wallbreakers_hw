public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<List<Integer>> list = new ArrayList<>();
    
    for(int i=0; i < numCourses; i++){
        list.add(new ArrayList<>());
    }
    
    for(int i=0;i<prerequisites.length;i++){
        int u = prerequisites[i][1];
        int v = prerequisites[i][0];
        list.get(u).add(v);
    }
    
    boolean[] visited = new boolean[numCourses];
    boolean[] stock = new boolean[numCourses];
    Queue<Integer> q = new LinkedList<>();
    
    for(int i = 0; i < numCourses; i++){
        if(isCycle(list, visited, stock, q, i)){
            return new int[0];
        }
    }
    
    int[] result = new int[numCourses];
    int k = numCourses - 1;
    while(q.size()!=0){
        result[k--] = q.poll();
    }
    return result;
    
}

public boolean isCycle(List<List<Integer>> l, boolean[] visited, boolean[] stock, Queue<Integer> q, int i){
    
    if(stock[i]) {
        return true;
    }
    
    if(visited[i]) {
        return false;
    }
    
    visited[i] = true;
    stock[i] = true;
    
    List<Integer> adj = l.get(i);
    for(int c : adj){
        if(isCycle(l, visited, stock, q, c)){
            return true;
        }
    }
    
    stock[i] = false;
    q.add(i);
    
    return false;
}