package stream_api;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operations_On_Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 8, 6, 9, 7, 4, 5, 26, 28, 30, 36, 48, 10, 15, 14, 17, 19, 8);
//        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(filteredList);
//        List<Integer> newList = filteredList.stream().map(n -> n / 2).collect(Collectors.toList());
//        System.out.println(newList);

        // dono ko ek sath use kr sakte he
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .filter(x -> x % 2 == 0)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(3)
                .skip(1)
                .collect(Collectors.toList());
//        System.out.println(newList);

//        List<Integer> myList = Stream.iterate(0, n -> n + 1)
//                .limit(101)
//                .skip(1)
//                .filter(x -> x%2 == 0)
//                .map(x->x/10)
//                .distinct()
//                .sorted()
//                .peek(x -> System.out.println(x))
//                .collect(Collectors.toList());
//        System.out.println(myList);


//        Integer integer = Stream.iterate(0, n -> n + 1)
//                .limit(101)
//                .map(x -> x / 20)
//                .distinct()
//                .peek(System.out::println)
//                .max((a, b) -> a - b).get();
        Long integer = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .count();
        System.out.println(integer);

        List<Integer> li = Arrays.asList(1,2,3,4,5);
        li.parallelStream(); // ye stream ki trh hota he hum isko tab use karte he jab hamari list bhut badi ho
        // ye list ko small chunk me divide kar deta he and different thread kaam karte he.
    }
}
