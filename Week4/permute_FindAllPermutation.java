public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> permutation = new ArrayList<>();
    permuteList(nums, permutation, 0);
    
    return permutation;
}

public void permuteList(int[] nums, List<List<Integer>> result, int start){
    if(start >= nums.length){
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        result.add(list);
    }
    else {
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            permuteList(nums, result, start +1);
            swap(nums, start, i);
        }
    }
}

public void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}