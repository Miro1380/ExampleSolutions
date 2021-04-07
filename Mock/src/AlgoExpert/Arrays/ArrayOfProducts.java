package AlgoExpert.Arrays;

import java.util.Arrays;

public class ArrayOfProducts {

    public static void main(String[]args){

        int[] array = {5,1,4,2};
        System.out.println(Arrays.toString(arrayOfProducts(array)));
    }

    public static int[] arrayOfProducts(int[] array){
        int[] products = new int[array.length];

        int lrp = 1;
        for(int i = 0; i < array.length;i++){
            products[i] = lrp;
            lrp *= array[i];
        }

        int rrp = 1;
        for(int i = array.length-1; i>=0; i--){
            products[i] *= rrp;
            rrp *= array[i];
        }


        //O(n^2)
        /*
        for(int i = 0 ; i < array.length; i++){
            int product = 1;
            for(int j = 0 ; j < array.length;j++){
                if(j != i){
                    product *= array[j];
                }
                products[i] = product;
            }

        }*/

        //O(n^2) approach
        /*
        for(int i = 0; i < array.length; i ++){
            int sProduct = 1;

            //Left product
            for(int l = 0; l < i; l++){
                sProduct *= array[l];
            }
            //Right product
            for(int r = array.length-1; r > i; r--){
                sProduct *= array[r];
            }

            products[i] = sProduct;
        }

         */
        return products;
    }
}
