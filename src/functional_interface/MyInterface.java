package functional_interface;

@FunctionalInterface
public interface MyInterface {
    public void sayHello();
    default void sayOk(){
    }
    static void sayGoodbye(){
        System.out.println("Goodbye!");
    }
}
