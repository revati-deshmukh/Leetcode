import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
    }

    public static void main(String[] args){
        GetIntersectionNode gin = new GetIntersectionNode();

        //gin.getIntersectionNode();

        /**
         * Example 1:
         * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
         * Output: Intersected at '8'
         * Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
         * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
         *
         * Example 2:
         * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
         * Output: Intersected at '2'
         * Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
         * From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
         *
         * Example 3:
         * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
         * Output: No intersection
         * Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
         * Explanation: The two lists do not intersect, so return null.*/
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> set = new HashSet<>();
        ListNode list1= headA;

        while(list1 != null){
            set.add(list1);
            list1 = list1.next;
        }

        list1 = headB;
        while(list1 != null){
            if(set.contains(list1)){
                return list1;
            }

            list1 = list1.next;
        }

        return null;
    }

    public ListNode getIntersestion(ListNode headA, ListNode headB){
        ListNode list1 = headA;
        ListNode list2 = headB;

        while(list1 != null){
            while(list2 != null){

                if(list1 == list2)
                    return list1;

                list2 = list2.next;
            }
            list1 = list1.next;
            list2 = headB;
        }

        return null;
    }
}
