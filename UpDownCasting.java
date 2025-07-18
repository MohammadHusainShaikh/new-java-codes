class A
{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show(){
        System.out.println("In B show");
    }
}
public class UpDownCasting {
    public static void main(String[] args) {
        // Implicitlly upcasting
        A obj = new B(); // Explicitly  A obj = (A) new B(); , but dont have tp mention it java aoutomatic do this
        obj.show();
        // DownCasting, converting reference from type of A to type of B
        B obj1 = (B) obj;// here you are not getting new object you dirctly assing to new ref by old reference
        obj1.show();;

    } 
}
