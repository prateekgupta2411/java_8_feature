package create_thread_using_lambda_expression;

//class MyClass implements Runnable {
//    @Override
//    public void run() {
//        for(int i=0;i<=10;i++) {
//            System.out.println("Hello " + i);
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for(int i=0;i<=10;i++) {
                System.out.println("Hello " + i);
            }
        };
//        MyClass mc = new MyClass();
        Thread t = new Thread(runnable);
        t.start();
    }
}
