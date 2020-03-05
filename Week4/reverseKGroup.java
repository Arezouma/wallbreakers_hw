public ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || k == 1 || head.next == null){
        return head;
    }
    int count = 0;
    ListNode curr = head;
    
    while(curr != null){
        count++;
        curr = curr.next;
    }

    int div = count / k;
    ListNode prev = new ListNode(0);
    prev.next = head;
    ListNode result = prev;

    for(int i = 0; i < div; i++){
        ListNode following = prev.next.next;
        ListNode tail = prev.next;
        for(int j = 1; j < k; j++){
            ListNode temp = prev.next;
            prev.next = following;
            following = following.next;
            prev.next.next = temp;
            tail.next = following;
        }
        prev = tail;
    }
    return result.next;
    
}