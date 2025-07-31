interface F
{
    void show();
}
class G implements F
{
    public void show(){
        System.out.println("In overrided show");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {
        F g = new G(){
            public void show(){
                System.out.println("In new show");
            }
        };
        g.show();
        
    }
}
