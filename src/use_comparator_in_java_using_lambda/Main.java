package use_comparator_in_java_using_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Prateek", 22);
        Employee employee2 = new Employee("Ravi", 25);
        Employee employee3 = new Employee("Suresh", 21);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        Collections.sort(employees, (a,b) -> b.age - a.age);
        System.out.println(employees);
    }
}
