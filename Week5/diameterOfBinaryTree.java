int max = 0;
public int diameterOfBinaryTree(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null){
        return 0;
    }
    
    return getDiameter(root, root) - 1;
}

public int getDiameter(TreeNode root, TreeNode current){
    if(root == null) 
        return 0;
    int l = 0, r = 0, curSum = 0, sum = 0;
    if(root.left != null){
        l += getDiameter(root.left, current);
    }
    if(root.right != null){
        r += getDiameter(root.right, current);
    }
    curSum = Math.max(l, r) + 1;
    sum = l + r + 1;
    int newMax = Math.max(Math.max(l + 1, r + 1), sum);
    if(newMax > max){
        max = newMax;
    }
    return (root == current) ? max : curSum;
}