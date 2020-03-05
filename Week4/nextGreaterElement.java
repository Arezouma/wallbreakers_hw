public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    for(int n : nums2){
        list.add(n);
    }
    int idx = 0;
    int[] result = new int[nums1.length];
    Arrays.fill(result, -1);
    
    for(int i = 0; i < nums1.length; i++){
        int index = list.indexOf(nums1[i]);
        for(int j = index + 1; j < nums2.length; j++){
            if(nums2[j] > nums2[index]){
                result[idx] = nums2[j];
                break;
            }
        }
        
        idx++;
    }
    return result;
}