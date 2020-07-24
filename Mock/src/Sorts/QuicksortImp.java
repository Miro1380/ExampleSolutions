package Sorts;

public class QuicksortImp {
    public static void main(String []args){
        int[] arr = {1,4,2,6,3,8,5,9,0};

        QuicksortImp qksrt = new QuicksortImp();
        qksrt.quicksort(arr,0,arr.length-1);

        System.out.println("After sort");
        for(int elem: arr){
            System.out.println(elem);
        }
    }

    //Single pivot implementation
    public int[] quicksort(int [] arr, int p, int r){
        if( p < r){
            int q = partition(arr, p, r);
            quicksort(arr, p, q-1);
            quicksort(arr,q+1, r);
        }


        return arr;
    }

    public int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i = p - 1;
        for(int j = p; j <= r -1; j++){
            if(arr[j]<= x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }
}
