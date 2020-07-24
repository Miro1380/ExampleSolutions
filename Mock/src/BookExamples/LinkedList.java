package BookExamples;

import java.util.Iterator;

public class LinkedList<E> {
    private Node head;
    private Node tail;

    //Inner class
    private class Node {
        int data;
        Node next;

        //constructor
        Node (int data){
            this.data = data;
            this.next = null;
        }

    }

    //Helper methods
    void insert(int data){
        Node newNode = new Node(data);

        if(this.isEmpty()){
            head = newNode;
            tail = newNode;

        }
        else {

            tail.next = newNode;

            //newNode becomes the new tail of list.
            tail = newNode;
        }
    }

    boolean isEmpty(){
        return head == null ;
    }

    //Main
    public static void main(String []args){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i < 5; i++){
            list.insert(i);
        }

        list.printList();
    }

    public void printList (){
        Node current = this.head;

        if(current == null){
            System.out.println("List is empty");
            return;
        }

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
