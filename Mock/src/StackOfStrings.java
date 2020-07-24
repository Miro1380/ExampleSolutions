//import edu.princeton.cs.algs4.Stack;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;
import java.util.Stack;



// Part of Princeton - Coursera Alg I class.
public class StackOfStrings {
    Stack<String> stack = new Stack<>();

    private class Item{

    }

    private class MyClass{

    }
    private class St <Item> {
        // Item is a generic type. Cannot be instantiated. Must be cast to Item[] from an Object.
        private Item[] s = (Item[]) new Object[5];
        private MyClass[] clss = new MyClass[5];

    }

    StackOfStrings(){

    }

    void push(String item){
        stack.push(item);
        System.out.println("Pushed "+ item + " to stack.");
    }

    String pop(){
    return stack.pop();
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }
    int size(){
        this.isEmpty();
        return stack.size();
    }

    public static void main(String []args){
        StackOfStrings vals = new StackOfStrings();
        Scanner scanner = new Scanner( System.in);

        System.out.println("Enter strings. Type -e to end.");
        String input = scanner.next();
        while(!input.equals("-e")){
            vals.push(input);
            input = scanner.next();
        }

        //Print stack in reverse input order
        System.out.println("--Printing values-- ");
        while(!vals.isEmpty()){
            System.out.println(vals.pop());
        }
    }
}

