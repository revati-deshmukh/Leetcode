public class OddEvenLL {
    public static void main(String[] args){
        RemoveDuplicateFromSortedLL ll = new RemoveDuplicateFromSortedLL();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.display();
        ListNode ans = oddEven(ll.head);
    }

    public static ListNode oddEven(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode eHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = eHead;

        return head;
    }
}
