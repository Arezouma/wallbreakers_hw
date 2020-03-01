public int rob(int[] nums) {
    if(nums.length == 0){
        return 0;
    }
    if(nums.length == 1){
        return nums[0];
    }
    if(nums.length == 2){
        return Math.max(nums[0], nums[1]);
    }
    
    int[] first = new int[nums.length-1];
    first[0] = nums[0];
    first[1] = Math.max(nums[0], nums[1]);
    
    int[] second = new int[nums.length];
    second[1] = nums[1];
    second[2] = Math.max(nums[1], nums[2]);
    
    for(int i = 2; i < nums.length-1; i++){
        first[i] = Math.max(first[i-1], first[i-2] + nums[i]);
    }
    
    for(int i = 3; i < nums.length; i++){
        second[i] = Math.max(second[i-1], second[i-2] + nums[i]);
    }
    
    return Math.max(second[second.length -1], first[first.length-1]);
    
}