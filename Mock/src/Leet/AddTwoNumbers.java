package Leet;

class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

public class AddTwoNumbers {
    public static void main(String[]args){

        AddTwoNumbers sol = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l5 = new ListNode(3);
        l1.next = l3;
        l3.next = l5;

        //L2 set
        ListNode l2 = new ListNode(5);
        ListNode l4 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l2.next = l4;
        l4.next = l6;

        sol.addTwoNumbers(l1,l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0);
        boolean carry = false;
        int sum = 0;
        while(l1 != null && l2 != null){
            System.out.println(l1.val + " , "+ l2.val);
            //Add node.val
            int val  = l1.val + l2.val;

            //If val >= 10 create a carry and assign next value a zero (0)
            if( val >= 10  ){
                ListNode next  = new ListNode(1);
                carry = true;
            }


            //Move to next set of nodes
            l1 = l1.next;
            l2 = l2.next;


        }
        return null;
    }
}
