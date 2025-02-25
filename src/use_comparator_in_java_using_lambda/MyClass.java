package use_comparator_in_java_using_lambda;

import java.util.*;

public class MyClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b-a;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 5);
        Collections.sort(list, new MyClass()); // Using Collections.sort
        System.out.println(list); // Output: [5, 4, 2, 1]

    }
}

