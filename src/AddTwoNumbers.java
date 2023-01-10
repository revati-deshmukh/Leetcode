public class AddTwoNumbers {
    static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(){}
    }
    private Node head;

    public void insertFirst(int val){
        Node first = new Node(val);
        first.next = head;
        head = first;
    }

    public static Node addTwoNumber(Node list1, Node list2){
        Node dummy = new Node();
        Node temp = dummy;
        int sum = 0;
        int carry = 0;

        while(list1 != null || list2 != null){
            sum = 0;
            if(list1 != null) {
                sum += list1.value;
                list1 = list1.next;
            }

            if(list2 != null) {
                sum += list2.value;
                list2 = list2.next;
            }
            sum += carry;
            carry = sum >= 10 ? 1 : 0;
            Node node = new Node(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        if(carry == 1){
            Node carryNode = new Node(carry);
            temp.next = carryNode;
        }

        return dummy.next;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }
    public static void main(String[] args){
        AddTwoNumbers first = new AddTwoNumbers();
        AddTwoNumbers second = new AddTwoNumbers();

        first.insertFirst(5);
        first.insertFirst(6);
        first.insertFirst(4);
        first.insertFirst(2);
        display(first.head);
        second.insertFirst(7);
        second.insertFirst(4);
        second.insertFirst(3);
        display(second.head);
        Node res = addTwoNumber(first.head, second.head);
        display(res);
    }
}
