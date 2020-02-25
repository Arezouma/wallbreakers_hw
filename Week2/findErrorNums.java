public int[] findErrorNums(int[] nums) {
    int[] ans = new int[2];
    int exclus = 0, absolute = 0;
    for(int i = 0; i < nums.length; i++){
        absolute = Math.abs(nums[i]);
        exclus = exclus ^ absolute ^ (i + 1);
        if(nums[absolute - 1] < 0){
            ans[0] = absolute;
        }
        nums[absolute - 1] = -1 * nums[absolute - 1];
    }
    ans[1] = exclus ^ ans[0];
    return ans;
    
}