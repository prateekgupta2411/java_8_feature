package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreamApi {
    public static void main(String[] args) {
        // Creating an immutable list of integers
        List<Integer> list = List.of(1, 2, 3, 4, 6, 9, 20, 12);

        // Filtering even numbers from the list and collecting them into a new list
        List<Integer> newList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList); // Output: [2, 4, 6, 20, 12]

        // Filtering numbers greater than 4 from the original list
        System.out.println(list.stream().filter(i -> i > 4).collect(Collectors.toList())); // Output: [6, 9, 20, 12]

        // Creating a stream from an array of strings
        String name[] = {"Prateek", "Gupta", "Ankit"};
        Stream<String> stream = Stream.of(name);

        // Printing each name in the stream
        stream.forEach(e -> {
            System.out.println(e);
        });

        // Creating an ArrayList and adding elements
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Creating a stream from the ArrayList
        Stream<Integer> stream1 = list2.stream();

        // Printing each element in the stream
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // Filtering names that start with "P" from the list
        List<String> names = List.of("Prateek", "Priya", "Pankaj", "durgesh", "he");
        List<String> newName = names.stream()
                .filter(e -> e.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(newName); // Output: [Prateek, Priya, Pankaj]

        // Mapping each number to its square and collecting into a list
        List<Integer> num = List.of(1, 2, 3, 4, 6, 9, 20, 12);
        List<Integer> square = num.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(square); // Output: [1, 4, 9, 16, 36, 81, 400, 144]

        // Printing each name using lambda expression
        names.stream().forEach(
                e -> {
                    System.out.println(e);
                }
        );

        System.out.println("--------------------------------");

        // Printing each name using method reference
        names.stream().forEach(System.out::println);

        // Sorting the numbers in ascending order and printing them
        num.stream().sorted().forEach(System.out::println);

        // Finding the minimum number using min() function
        Integer minNumber = num.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum number is: " + minNumber);
    }
}
