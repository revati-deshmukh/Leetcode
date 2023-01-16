public class RemoveNthNodeFromLL {
    public static void main(String[] args){
        RemoveDuplicateFromSortedLL list = new RemoveDuplicateFromSortedLL();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        removeNthFromEnd(list.head, 2);
        list.display();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null && n == 1)
            return null;

        int size = 1;
        ListNode node = head;
        while(node.next != null){
            size++;
            node = node.next;
        }
        if(size-n-1 < 0) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        for(int i = 0; temp!= null && i < size-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
