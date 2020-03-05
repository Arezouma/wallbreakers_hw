public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> sets = new ArrayList<>();
    
    for(int i = 0; i < (1 << nums.length); i++){
        List<Integer> list = new ArrayList<>();
        
        for(int j = 0; j < nums.length; j++){
            
            if((i & (1 << j)) > 0){
                list.add(nums[j]);
            }
        }
        sets.add(list);
    }
    return sets;
    
}