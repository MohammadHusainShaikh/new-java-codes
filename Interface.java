interface C{
    int age = 33; // variable in interface are by default final and static
    String area = "Jalgaon";

    void show();// method in interface are by defult public and abstract and doew not any body
    void config();
}
interface D
{
    void run();
}
class E implements D , C //we can achive multiple inheritance using Interface
{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("runnig");
    }
}
public class Interface {
    public static void main(String[] args) {
        E obj = new E(); // we cannot create create object of interface but instance variable can do. 
        obj.show();
        obj.config();
        obj.run();
        System.out.println(C.age);//we can directly call variable by class name becouse they by default static
        System.out.println(C.area);
        // but cannot assign new value to them becouse they final
    }
}
