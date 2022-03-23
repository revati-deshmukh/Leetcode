public class DeleteDuplicates {
    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value = value;
        }
    }

    public static void main(String[] args){
        DeleteDuplicates dd = new DeleteDuplicates();
        // ListNode head = {};
        // var result = dd.deleteDuplicates();
        // System.out.println(result);

        /**
         * Example 1:
         * Input: head = [1,1,2]
         * Output: [1,2]
         *
         * Example 2:
         * Input: head = [1,1,2,3,3]
         * Output: [1,2,3]
         */

    }

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode first = head;

        while(first.next != null){

            if(first.value == first.next.value){
                first.next = first.next.next;
            } else {
                first = first.next;
            }

        }

        return head;
    }
}
