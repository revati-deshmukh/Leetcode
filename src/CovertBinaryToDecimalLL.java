public class CovertBinaryToDecimalLL {
    public static void main(String[] args){
        RemoveDuplicateFromSortedLL ll = new RemoveDuplicateFromSortedLL();
        ll.insertFirst(1);
        ll.insertFirst(0);
        ll.insertFirst(1);

        CovertBinaryToDecimalLL obj = new CovertBinaryToDecimalLL();
        System.out.println(obj.getDecimalValue(ll.head));
    }

    public int getDecimalValue(ListNode head) {
        int sum = 0;
        int size = 1;
        ListNode node = head;
        while(node.next != null){
            node = node.next;
            size++;
        }
        ListNode temp = head;
        for(int i = size-1; temp != null && i >= 0; i--){
            sum += temp.val * Math.pow(2, i);
            temp = temp.next;
        }
        return sum;
    }
}
