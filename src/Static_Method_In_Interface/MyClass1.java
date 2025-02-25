package Static_Method_In_Interface;

interface C{
    static void show(){
        System.out.println("Static Method In Interface C");
    }
}
public class MyClass1 implements C{
    // implements class ko dikhega he nhi to override kya karega
    static void show(){ // ye override nhi kr rha ye sift apne implementation likh rha he
        System.out.println("Static Method In MyClass1");
    }

    public static void main(String[] args) {
        C.show(); // Calls the static method in the interface C
        MyClass1.show(); // Calls the static method in MyClass1
    }
}
