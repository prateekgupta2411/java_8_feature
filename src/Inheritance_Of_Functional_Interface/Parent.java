package Inheritance_Of_Functional_Interface;

public interface Parent {
    public void sayHello();
}
@FunctionalInterface
interface child extends Parent {
    public void sayHello();
}