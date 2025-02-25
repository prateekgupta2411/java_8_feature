package default_methods_In_Interface;

interface Parent{
    default void sayHello(){
        System.out.println("hello");
    }
}
class Child implements Parent{
    // overriding default method
    @Override
    public void sayHello(){
        System.out.println("child hello");
    }
    public void childMethod() {
        System.out.println("Unique method of Child");
    }

}
public class MyClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
        c.childMethod();
        Parent ch = new Child();
        ch.sayHello();
        // ch.childMethod();  // ❌ ERROR: Parent type ke reference me Child ke specific methods access nahi ho sakte
//        Parent p = new Parent(); // not create because parent is interface and it contant abstract method

    }
}
