package AlgoExpert;


public class RemDupLList {

    public static void main(String[]args){
        int[] arr = {1,1,3,4,4,4,5,6,6};
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(1);

    }

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }

    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList currentNode = linkedList;
        while(currentNode != null){
            LinkedList nextNode = currentNode.next;
            System.out.println("Current Node: "+currentNode.value);
            while(nextNode != null && nextNode.value == currentNode.value){
                //Skip node if identical
                nextNode = nextNode.next;
            }
            currentNode.next = nextNode;
            currentNode = nextNode;
        }
        return linkedList;
    }
}
