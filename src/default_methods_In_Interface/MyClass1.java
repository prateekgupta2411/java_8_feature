package default_methods_In_Interface;

interface A {
    default void show() {
        System.out.println("From interface A");
    }
}

interface B {
    default void show() {
        System.out.println("From interface B");
    }
}

public class MyClass1 implements A, B {
    public static void main(String[] args) {
        MyClass1 myClass = new MyClass1();
        myClass.show();
    }

    @Override
    public void show() {
        A.super.show();
        System.out.println("Hello");
    }
}
