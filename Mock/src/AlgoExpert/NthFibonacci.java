package AlgoExpert;

public class NthFibonacci {

    public static void main(String[]args){
        int n = 2;
        System.out.println(getNthFib(n));

        int n2 = 6;
        System.out.println(getNthFib(n2));

    }

    public static int getNthFib(int n){

        if(n == 2){
            return 1;
        }
        if(n == 1){
            return 0;
        }
        if(n > 2) return getNthFib(n-1)+ getNthFib(n-2);

        return n;
    }

    //Per A.E.
    public static int getNthFib2(int n){
        int[] vals = {0,1};
        for(int i = 3 ; i < n; i++){
            int nextNum = vals[0] + vals[1];
            vals[0] = vals [1];
            vals[1] = nextNum;
        }
        return n > 1 ? vals[1] : vals[0];
    }
}
