package Udemy.MasterClassExamples;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();


        for(int i =0; i < 100; i++){
            squares.add((int)Math.pow(i,2));
            cubes.add((int) Math.pow(i, 3));
        }

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union size: "+ union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection size: "+ intersection.size());

    }
}
