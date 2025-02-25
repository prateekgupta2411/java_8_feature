package use_comparator_in_java_using_lambda;

public class Employee {
    public String name;
    public int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (" + age + ")";
    }
}
