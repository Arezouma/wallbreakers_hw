public ListNode reverseBetween(ListNode head, int m, int n) {
    if(head == null) {
        return null;
    }
    if(m == n){
        return head;
    }
    int count = 1;
    ListNode curr = head;
    ListNode prev = null;
    while(count < m) {
        prev = curr;
        curr = curr.next;
        count++;
    }
    ListNode firstAtm = prev; //ListNode at index m
    ListNode lastAtn = curr;  //ListNode at index n
    ListNode endList = null;  //ListNode at index length - 1
    while(m <= n) {
        endList = curr.next;
        curr.next = prev;
        prev = curr;
        curr = endList;
        m++;
    }
    if(firstAtm != null) {
        firstAtm.next = prev;
    } else {
        head = prev;
    }
    lastAtn.next = curr;
    return head;
}