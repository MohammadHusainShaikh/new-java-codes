class A{
    public final int add(int a,int b){
        return a+b;
    }
}
class B extends A{
    public int add(int a,int b){
        System.out.println("In child");
        return a+b;
    }
}
public class Final {
    public static void main(String[] args) {
        final int n = 30;
        System.out.println(n);
        B obj = new B();
        System.out.println(obj.add(3, 4));
    }
}
