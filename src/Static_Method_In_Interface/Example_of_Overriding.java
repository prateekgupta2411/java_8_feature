package Static_Method_In_Interface;
//
//Overriding कब होगी?
//
//Overriding तभी होगी जब:
//        ✅ Parent class में non-static (instance) method हो।
//        ✅ Child class में वही method same signature के साथ हो।
//        ✅ Method को @Override annotation से mark कर सकते हैं (optional but recommended)।
//        ✅ Static methods कभी override नहीं होतीं, सिर्फ instance methods होती हैं।

//🔴 Overriding कब नहीं होगी? (Common Mistakes)
//Case	Overriding होगी?	Reason
//Static method को override करने की कोशिश	❌ नहीं	यह method hiding कहलाता है
//Private method को override करने की कोशिश	❌ नहीं	Private methods inherited नहीं होतीं
//Final method को override करने की कोशिश	❌ नहीं	Final method को override नहीं कर सकते
//Constructor को override करने की कोशिश	❌ नहीं	Constructor कभी override नहीं होते
//Parent method को child class में कम restrictive access देने की कोशिश (Protected → Private)	❌ नहीं	Overriding में access modifier को कम restrictive नहीं कर सकते

class Parent {
    public void show() {   // Non-static method
        System.out.println("Parent show()");
    }
}
class Child extends Parent {
    @Override
    public void show() {  // Overriding the method
        super.show();  // Parent class method call
        System.out.println("Child show()");
    }
}
public class Example_of_Overriding {

    public static void main(String[] args) {
        Parent obj = new Child(); // Dynamic method dispatch
        obj.show();  // Output: Child show()
    }
}
