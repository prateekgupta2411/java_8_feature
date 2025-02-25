interface MyInterface {
    void show();
}
public class Main {
//    public static void main(String[] args) {
//        MyInterface obj = () -> System.out.println("Lambda Expression");
//        obj.show();
//    }
//}

    public static void main(String[] args) {
        MyInterface obj = new MyInterface()
            // Anonymous class
        {
            @Override
            public void show() {
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.show();
    }
}