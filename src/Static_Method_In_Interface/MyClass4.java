package Static_Method_In_Interface;
class D{
    public static void show(){
        System.out.println("Method");
    }
}
public class MyClass4 extends D {
    public static void show(){ // method hiding ho rhi h na ki overriding
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        MyClass4 obj = new MyClass4();
        MyClass4.show();  // Output: Static Method
        D.show();         // Output: Method
        D d = new MyClass4();
        d.show();         // Output: Method
//        ye obj ka type MyClass4 he
//        Static methods ko objects se call krna galt practise h, but java allow this
//        Method Hiding ki bajh se, MyClass4 ka show mwthod call hoga
//
//        Static Method Overriding क्यों नहीं होती?
//        Static methods Class से belong करती हैं, न कि Object से।
//        Runtime polymorphism सिर्फ instance methods पर काम करता है।
//        Method overriding में dynamic binding होती है, जबकि static methods पर compile-time binding होती है।

//        Conclusion:
//👉 आपके कोड में overriding नहीं हुई, बल्कि method hiding हुई है।
//👉 Static methods को override नहीं किया जा सकता, क्योंकि वे class level पर bind होती हैं, न कि object level पर।
    }
}

////Error
//🔹 Summary:
//Case	Error?	Reason
//Static method को static method से hide करना	❌ No Error	यह method hiding कहलाता है
//Static method को instance method से override करना	✅ Error	Static method को instance method override नहीं कर सकता
//Instance method को static method से override करना	✅ Error	Instance method को static method override नहीं कर सकता
//Static method के ऊपर @Override annotation लगाना	✅ Error	Static methods override नहीं होते
