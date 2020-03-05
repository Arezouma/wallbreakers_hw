public List<List<Integer>> combine(int n, int k) {
        
    List<List<Integer>> sets = new ArrayList<>();
    helper(sets, new ArrayList<>(), 1, k, n);
    return sets;
}

public void helper(List<List<Integer>> res, List<Integer> list, int index, int start, int end){
    if(start == list.size()){
        res.add(list);
        
        return;
    }
    for(int j = index; j <= end; j++){
        List<Integer> newList = new ArrayList<>(list);
        if(newList.contains(j)){
            continue;
        }
        newList.add(j);
        helper(res, newList, j+1, start, end);

    }
}