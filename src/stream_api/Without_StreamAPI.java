package stream_api;

import java.util.*;

public class Without_StreamAPI {
    public static void main(String[] args) {
        // Way 1 to create list
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);

        // way 2 to create list
//        List<Integer> list = Arrays.asList(1, 2, 4, 20);

        // way 3 to create list
        List<Integer> list = List.of(1, 2, 3, 4);
        List<Integer> evenNumbers = new ArrayList<>();
        for(int i : list){
            if(i % 2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println(list);
        System.out.println(evenNumbers);
    }

}
