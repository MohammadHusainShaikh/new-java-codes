class A{
    public void show(){
        System.out.println("In A class (Parent)");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B class(Child)");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C class(Child)");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        A ob;
        ob = new A();
        ob.show();
        ob = new B();
        ob.show();
        ob = new C();
        ob.show();
    }
}
