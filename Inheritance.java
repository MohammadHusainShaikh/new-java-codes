class Calc
{
    int n1;
    int n2;
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
class AdvCalc extends Calc
{
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
//multilevel inheritance
class Power extends AdvCalc
{
    public double pow(int n1,int n2){
            return Math.pow(n1,n2);
        
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Power obj = new Power();
        obj.n1= 3;
        obj.n2 = 4;
        System.out.println(obj.div(5,6));
        System.out.println(obj.add(obj.n1,obj.n2));
        System.out.println(obj.sub(5,2)); 
        System.out.println(obj.mul(obj.n1,obj.n2)); 
        System.out.println(obj.pow(4, 4));
        
    }
}
