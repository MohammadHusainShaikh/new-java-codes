
class A
{
    public void show(){
        System.out.println("in show");
    }
    static class B
    {
        public void config(){
            System.out.println("In config");
        }
    }
}
public class Inner {
    public static void main(String[] args) {
        A obj = new A(){
            // Anonymous class will override the show() method in A class 
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
        // A.B obj1 = obj.new B();// to create object of B (define B belongs to A by (A.B))
        // obj1.config();
        // if you dont want to use object of outer(A) create Inner(B) as static
        A.B obj1 = new A.B(); // we define inner class as static, thats why we are calling inner class by outer class
        obj1.config();
    }
}
