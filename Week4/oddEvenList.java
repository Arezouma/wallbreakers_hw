public ListNode oddEvenList(ListNode head) {
    if(head == null) {
        return null;
    }
    ListNode oddNode = head;
    ListNode evenNode = head.next;
    ListNode evenBoundary = evenNode;
    while(oddNode != null && evenNode != null){
        oddNode.next = evenNode.next;
        if(oddNode.next == null){
            break;
        }
        oddNode = evenNode.next;
        evenNode.next = oddNode.next;
        evenNode = oddNode.next;
    }
    oddNode.next = evenBoundary;
    return head;
}