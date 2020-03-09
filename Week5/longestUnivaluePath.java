int max = 0;
public int longestUnivaluePath(TreeNode root) {

    getNodeLength(root);
    
    return max;
    
}

public int getNodeLength(TreeNode root){
    if(root == null) 
        return 0;
    int left = 0, right = 0;
    int lenLeft = getNodeLength(root.left);
    int lenRight = getNodeLength(root.right);
    if(root.left != null && root.left.val == root.val){
        left = lenLeft + 1;
    }
    if(root.right != null && root.right.val == root.val){
        right = lenRight + 1;
    }
    
    max = Math.max(max, left + right);
    return Math.max(left, right);
}