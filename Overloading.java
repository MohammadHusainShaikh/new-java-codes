import java.util.Scanner;

class Calculator{
    public int add(int n1, int n2){
        System.out.println("this is first method");
        return n1 + n2;
    }
    public int add(int n1, int n2,int  n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        System.out.println("this is third method");
        return n1 + n2; // statement can be different
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        double n1 ;
        int n2;
        int n3;
        System.out.println("Enter the first Number");
        n1 = sc.nextDouble();
        System.out.println("Enter the second number");
        n2 = sc.nextInt();
          System.out.println("Enter the third number");
        n3 = sc.nextInt();
    //    int r = calc.add(n1,n2,n3);
    //     System.out.println(r);
    System.out.println("results are follow");
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.add(n1, n2));
        
      sc.close();
    }
}
