public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> list = new ArrayList<>();
    
    for(int i = 0; i < numCourses; i++){
        list.add(new ArrayList<>());
    }
    
    for(int[] pair : prerequisites){
        int u = pair[0];
        int v = pair[1];
        list.get(u).add(v);
        if(isCycle(list, pair[1], pair[0])){
            return false;
        }
    }
    return true;
    
}

public boolean isCycle(List<List<Integer>> list, int index, int target){
    
    if(list.get(index).size() == 0) {
        return false;
    }
    
    else if(list.get(index).contains(target)) {
        return true;
    }
    
    else {
        for(int c : list.get(index)){
            if(isCycle(list, c, target))
                return true;
        }
    }
    
    return false;
}