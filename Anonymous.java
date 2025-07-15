// this is the exaple of Anonymous object
class A{
    public void show(){
        System.out.println("Called by object");
    }
    public void show1(){
        System.out.println("Called by anonymous object");
    }
}
class B extends A
{
    public void dikha(){
        System.out.println("called by onother anonymous object \n le dekh");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        A obj ;
        obj = new A();
        obj.show();
        new A().show1();
        new A().show1();
        new B().dikha();
        // in here we update, extends class A and call by Acnonymous object (my logic)
        new B().show1();
    }
}
