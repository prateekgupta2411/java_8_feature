package use_comparator_in_java_using_lambda;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_Ex {
    public static void main(String[] args) {
//        Set<Integer> p = new TreeSet<>();
//        p.add(25);
//        p.add(20);
//        p.add(40);
//        System.out.println("before manual sorting" + p);
//        Set<Integer> pr = new TreeSet<>((p1, p2) -> p2 - p1);
//        pr.add(25);
//        pr.add(20);
//        pr.add(40);
//        System.out.println("After manual Sorting " + pr);

        Map<Integer,String> p = new TreeMap<>();
        p.put(2, "Prateek");
        p.put(3, "nit");
        p.put(1,"d");
        System.out.println("before manual sorting" + p);
        Map<Integer, String> pr = new TreeMap<>((p1, p2) -> p2 - p1);
        pr.put(2, "Prateek");
        pr.put(3, "nit");
        pr.put(1,"d");
        System.out.println("After manual Sorting " + pr);
    }
}
