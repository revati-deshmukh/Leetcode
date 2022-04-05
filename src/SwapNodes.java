import java.util.ArrayList;
import java.util.List;

public class SwapNodes {

    private static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args){
        SwapNodes sn = new SwapNodes();

        /**
         * Example 1:
         * Input: head = [1,2,3,4,5], k = 2
         * Output: [1,4,3,2,5]
         *
         * Example 2:
         * Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
         * Output: [7,9,6,6,8,7,3,0,9,5]
         * */
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode output = head;
        List<ListNode> list = new ArrayList<>();

        while(output != null){
            list.add(output);
            output = output.next;
        }

        var temp = list.get(k-1).val;
        list.get(k-1).val = list.get(list.size() - k).val;
        list.get(list.size() - k).val = temp;

        return head;
    }

}
