package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(20);
//        list.add(3);
//        Integer integer = list.stream().min((a,b) -> a-b).get();
//        System.out.println(integer);
        ArrayList<Object> list = new ArrayList<>();
        list.add("prate");
        list.add(1);
        list.add("Prat");
        list.add(20);
        list.add("rahul");
        list.add(3);

        // Removing all non-integer elements from the list
//        list.removeIf(element -> !(element instanceof Integer));

        // Using Stream API to filter out only numbers
        List<Integer> numbers = list.stream()
                .filter(a -> a instanceof Integer)
                .map(a -> (Integer) a)
                .collect(Collectors.toList());
        // Using Stream API to filter out only strings
        List<String> str = list.stream()
                .filter(a -> a instanceof String)
                .map(a -> (String) a)
                .collect(Collectors.toList());
        System.out.println(str);
    }
}

