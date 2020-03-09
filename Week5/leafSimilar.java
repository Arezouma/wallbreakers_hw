public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    getLeaf(root1, list1);
    getLeaf(root2, list2);
    return list1.equals(list2);
}

public void getLeaf(TreeNode root, List<Integer> list){
    if(root == null){
        return;
    }
    
    if(root != null){
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        getLeaf(root.left, list);
        getLeaf(root.right, list);
        
    }
    
}