public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> intersection = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
        set.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
        if (set.contains(nums2[i])) {
            intersection.add(nums2[i]);
        }
    }
    return intersection.stream().mapToInt(Number::intValue).toArray();
}