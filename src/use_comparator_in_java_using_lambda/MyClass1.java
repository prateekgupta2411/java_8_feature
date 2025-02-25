package use_comparator_in_java_using_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 5);
        Collections.sort(list, (a, b) -> b - a); // Lambda for descending order
        System.out.println(list); // Output: [5, 4, 2, 1]
    }
}
