List<Integer> list = new ArrayList<>();
    
public List<Integer> postorder(Node root) {
    if(root == null){
        return new ArrayList<>();
    }
    
    addNode(root);
    
    return list;
    
}

public void addNode(Node root){
    if(root == null){
        return;
    }
    
    if(root != null && root.children != null){
        for(Node n : root.children){
            addNode(n);
        }
    }
    list.add(root.val);
}