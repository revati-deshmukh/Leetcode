public class ReorderList {
    public static void main(String[] args){
        RemoveDuplicateFromSortedLL ll = new RemoveDuplicateFromSortedLL();
        ll.insertFirst(7);
        ll.insertFirst(6);
        ll.insertFirst(5);
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.display();
        ReorderList rol = new ReorderList();
        rol.reorderList(ll.head);
        ll.display();
    }

    public void reorderList(ListNode head) {
        ListNode mid = getMid(head);
        //Reverse 2nd half from mid
        ListNode firstHead = head;
        ListNode secondHead = reverse(mid);

        while(firstHead != null && secondHead != null){
            ListNode temp1 = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp1;

            ListNode temp2 = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp2;
        }
        if(firstHead != null){
            firstHead.next = null;
        }
    }

    public ListNode reverse(ListNode mid){
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
