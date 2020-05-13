package BookExamples;

public class GenDemo {
    public static void main(String []args){
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        //Show type
        iOb.showType();

        //Get val of ob
        int n = iOb.getOb();
        System.out.println(n);

        Gen<String> strOb = new Gen<>("Test Generic String");

        //Show Type
        strOb.showType();

        String str = strOb.getOb();
        System.out.println(str);
    }
}

class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    //Show Type of T
    void showType(){
        System.out.println("Object type: " + ob.getClass().getName());
    }
}
