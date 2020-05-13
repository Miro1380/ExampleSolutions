package BookExamples;


interface Containment<T> {
    boolean contains(T o);
}

class GenInterfaceEx<T> implements Containment<T>{
    T[] arrayRef;

    GenInterfaceEx(T[] o){
        arrayRef = o;
    }

    @Override
    public boolean contains(T o) {
        for(T x: arrayRef)
            if(x.equals(o)) return true;
            return false;
    }

    public static void main(String [] args){
        Integer[] a1 = {1};
        GenInterfaceEx g1 = new GenInterfaceEx(a1);
        System.out.println(g1.contains(1));
    }
}