import java.util.LinkedList;


// https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleNodeOfLL {
    public static void main(String[] args){
        MiddleNodeOfLL obj = new MiddleNodeOfLL();
        RemoveDuplicateFromSortedLL list = new RemoveDuplicateFromSortedLL();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        System.out.println(obj.middleNode(RemoveDuplicateFromSortedLL.head).val);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
