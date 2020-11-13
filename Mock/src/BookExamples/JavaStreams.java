package BookExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[]args){
        StreamList();
    }


    public static void IntStream(){
        IntStream.range(1,10).forEach(System.out :: println);

    }

    public static void IntStreamSum(){

        System.out.println(IntStream.range(1,5).sum());
    }

    public static void SortedFindFirst(){
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out :: println);
    }

    public static void StreamList(){
        List<String> people = Arrays.asList("A","B", "C","AC", "BC", "AB");
        people.stream()
                .map(x -> x.toLowerCase())
                .forEach(x -> System.out.println(x));
    }
}
