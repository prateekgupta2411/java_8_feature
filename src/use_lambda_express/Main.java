package use_lambda_express;
interface Employee{
    public String getName();
}

//class Developer implements Employee{
//    public String getName(){
//        return "Prateek Gupta";
//    }
//}
public class Main {
    public static void main(String[] args) {
//        Employee developer = new Developer();
//        System.out.println(developer.getName());
        Employee developer = () -> "Prateek Gupta";
        System.out.println(developer.getName());
        Employee manager = () -> "Manager";
        System.out.println(manager.getName());
    }
}
// using lambda expression we do not to use any seperate implementation class
// ctrl + shift + u se hum small kr sakte he text ko