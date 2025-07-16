class Calc
{
    public int add(int n1,int n2){
        System.out.println("Method in super class that have to be override by syb class");
        return n1+n2; 
    }
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2){
        System.out.println("In Sub Class method that overriding");
        return n1+n2+1;// statement can be different or we can redefine it
    }
}
public class Overriding {
    public static void main(String[] args) {
        // AdvCalc obj1 = new AdvCalc();
        // System.out.println(obj.add(3, 05));
        Calc obj;
        obj = new Calc();
        System.out.println(obj.add(5, 2));
        obj = new AdvCalc();
        System.out.println(obj.add(5, 5));
        
    
    }
}
