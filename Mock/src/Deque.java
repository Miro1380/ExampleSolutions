import java.util.Iterator;
import edu.princeton.cs.algs4.StdOut;


//TODO implement using LinkedList ???
public class Deque<Item> implements Iterable<Item> {
    private Item[] itemDeq;
    private int size = 0;

    // construct an empty deque
    public Deque(){
        itemDeq = (Item[]) new Object[1];
        size = itemDeq.length;
    }

    // is the deque empty?
    public boolean isEmpty(){
        return size > 0 ;
    }

    // return the number of items on the deque
    public int size(){
        int sizeVal = 0;
        Iterator it = this.iterator();
        for(Item itms : itemDeq){
            sizeVal++;
        }
        //System.out.println(sizeVal);
        return sizeVal;
    }

    // add the item to the front
    public void addFirst(Item item) {

    }
    // add the item to the back
    public void addLast(Item item){
        itemDeq[size()-1]  = item;
    }
//
//    // remove and return the item from the front
//    public Item removeFirst(){
//
//    }
//
//    // remove and return the item from the back
//    public Item removeLast(){
//
//    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator(){
        Iterator<Item> it = new Iterator<Item>() {
            private int currIndex = 0;

            //Check current index is not OoB and current index element is not null.
            @Override
            public boolean hasNext() {
                return currIndex < size && itemDeq[currIndex] != null;
            }

            //Return next element
            @Override
            public Item next() {
                return itemDeq[currIndex++];
            }
        };
        return it;
    }

    // unit testing (required)
    public static void main(String[] args){
        //StdOut.print("Test");
        //System.out.println("");
        Deque itemD = new Deque();
        System.out.println(itemD.size());

    }

}