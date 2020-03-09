public int sumOfLeftLeaves(TreeNode root) {
    if(root == null){
        return 0;
    }
    int sumLeaves = 0, left = 0;
    if(root != null){
        if(root.left != null && root.left.left == null && root.left.right == null){
            left += root.left.val;
            //System.out.println("first " + left);
        }
        left += sumOfLeftLeaves(root.left);
        //System.out.println("st " + left);
    }
    
    int right = sumOfLeftLeaves(root.right);
    //System.out.println("rt " + right);
    sumLeaves = left + right;
    
    return sumLeaves;
}