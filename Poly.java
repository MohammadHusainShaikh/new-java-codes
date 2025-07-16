class OverL
{
    public int add(int a, int b){
        System.out.println("Overloading");
        return a+b;
    }
    public int add(int a,int b, int c){
        System.out.println("Overloading");
        return a+b+c;
    }
}
class OverR{
    public int sub(int a,int b){
        System.out.println("method that from Overriding");
        return a-b;
    }
}
class OverRb extends OverR{
    public int sub(int a,int b){
        System.out.println("In child class");
        return a-b-b;
    }
}
public class Poly {
    public static void main(String[] args) {
       OverL o = new OverL(); 
        System.out.println(o.add(3, 04));
        System.out.println(o.add(3, 04, 2));
        OverRb ob = new OverRb();
        System.out.println(ob.sub(3, 5));

    }
}
