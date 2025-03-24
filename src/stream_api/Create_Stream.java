package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create_Stream {
    public static void main(String[] args) {
        // imperative Approach
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        // Stream
//        int[] arr2 = {1,2,3,4,5,6};
//        int sum2 = Arrays.stream(arr2).filter(n -> n%2 == 0).sum();
//        System.out.println(sum2);

        // convert list to stream
        List<String> list = Arrays.asList("Prateek", "Ritik", "Shivani");
        Stream<String> myStream = list.stream();

        // convert array to stream
        String[] array = {"Apple", "Banana", "Grapes"};
        Stream<String> stream = Arrays.stream(array);

        // convert directly on stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        // another ways
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
        // another ways
        Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(5);

    }
}