interface Computer
{
   void code();
}
class Laptop implements Computer
{
    public void code(){
        System.out.println("coding,compile,run");
    }
}
class Desktop implements Computer
{
    public void code(){
        System.out.println("coding, compli, run: Faster");
    }
}
class Devloper
{
    public void devApp(Computer obj){
        obj.code();
    }
}
public class InterfaceDm {
    public static void main(String[] args) {
        // 1.
        // Laptop lap = new Laptop();
        // Desktop desc = new Desktop();
        // Devloper dev = new Devloper();
        // dev.devApp(desc);
        // 2.
            Computer lap = new Laptop();
            Computer desc = new Desktop();
            Devloper me = new Devloper();
            me.devApp(desc);
    }
}
