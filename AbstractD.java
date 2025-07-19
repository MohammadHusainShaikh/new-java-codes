abstract class Car
{
    abstract public void drive();
    abstract public void fly();
    public void music(){
        System.out.println("Car play music");
    }
}
abstract class WagonR extends Car
{
    public void drive(){
        System.out.println("WagonR are running");
    }
    // public void fly(){
    //     System.out.println("Car flying");
    // }// if we dont define/implent abstract method in child class it becomes abstract class
}
class Fly extends WagonR    // concrete class 
{
    public void fly(){
        System.out.println("car flying");
    }
}
public class AbstractD {
    public static void main(String[] args) {
        WagonR car = new Fly();
        // we cannot creat object of abstract class, but reference can work.
        car.drive();
        car.music();
        car.fly();
    }
}
