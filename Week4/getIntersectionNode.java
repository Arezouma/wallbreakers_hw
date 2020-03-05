public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null){
        return null;
    }
    ListNode first = headA;
    ListNode second = headB;
    int aHead = 0, bHead = 0, diff = 0;
    while(first != null){
        aHead++;
        first = first.next;
    }
    while(second != null){
        bHead++;
        second = second.next;
    }
    if(aHead < bHead){
        second = headA;
        first = headB;
        diff = bHead - aHead;
    }else {
        first = headA;
        second = headB;
        diff = aHead - bHead;
    }
    for(int i = 0; i < diff; i++){
        first = first.next;
    }
    while(first != null && second != null){
        if(first == second){
            return first;
        }
        first = first.next;
        second = second.next;
    }
        
    return null;
    
}