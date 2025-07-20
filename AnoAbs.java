// this is the example of using of abstract and anonymous inner class both in java
abstract class A
{
    public abstract void show();
}
class B extends A
{
    public void show(){
        System.out.println("In B");
    }
}
public class AnoAbs {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println(" in new show");
            }
        }; 
        obj.show();  
    }
}
