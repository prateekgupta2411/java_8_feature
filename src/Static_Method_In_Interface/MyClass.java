package Static_Method_In_Interface;
interface A{
    static void show(){
        System.out.println("Static method in interface");
    }
}
public class MyClass implements A {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
//        obj.show();// nhi kr sakta
//        MyClass.show();// nhi kr sakta
        A.show(); // kr sakta
    }
}
