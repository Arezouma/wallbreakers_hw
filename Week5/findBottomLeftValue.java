public int findBottomLeftValue(TreeNode root) {
        
    if(root.left == null && root.right == null){
        return root.val;
    }
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int maxLeft = root.val;
    
    while(!queue.isEmpty()){
        int size = queue.size();
        maxLeft = queue.peek().val;
        
        for(int i = 0 ; i<size ; i++){
            TreeNode current = queue.remove();
            if(current.left != null){
                queue.add(current.left);
            }
            
            if(current.right != null){
                queue.add(current.right);
            }
        }
        
    }
    return maxLeft;
    
}