class Calculator{
     private int a;
     private int b;
    public Calculator(int a, int b )
    {
       //this.a = 3;// if hare we assign the value then it will override the value come from constructor and this
        this.a=a;
        this.b = b;
    }
    public int getAdd(){
        // System.out.println(this.a + this.b);
        return this.a + this.b;
        
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator(2,8);
        System.out.println(calc.getAdd());
        // calc.getAdd();
               // if you are retrning somthing write/ call method that in sout line 
                // if you are not returning anything and the method you are calling write that in dirctly(calc.gettAdd())
    }
}
