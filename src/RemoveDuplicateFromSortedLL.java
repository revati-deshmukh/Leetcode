class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicateFromSortedLL {
    public static void main(String[] args){
        insertFirst(3);
        insertFirst(2);
        insertFirst(1);
        insertFirst(1);
        display();
        deleteDuplicates(head);
        display();
    }
    private static ListNode head;

    public static void insertFirst(int val){
        ListNode first = new ListNode(val);
        first.next = head;
        head = first;
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode temp = head;

        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }
}
