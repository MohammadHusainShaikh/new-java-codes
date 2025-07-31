interface Inter
{
    int add(int i, int j);
}
public class LambdaExpression {
    public static void main(String[] args) {
        // 1 . to accept value without lambda expression
        // Inter o = new Inter() {
        //     public void show(int i){
        //         System.out.println("In new show "+i);
        //     }
        // };
        // o.show(5);
       
        // 2. to accept value with Lambda Expression
        // Inter o = (int i) -> {
        //         System.out.println("In new show "+i);
        //     }
        //  ;
            // if you have only one statement wirte it in one line
            // 2.1 Inter o = (int i) -> System.out.println("In new show "+i);
            // o.show(510);
        // the interface function is changed show(int i) to add(int i,int j) maybe be upper is not working
        
        //3 Lambda expresshoin with return value

            // Inter o = (int i, int j) ->{
            //     return i+j;
            // };
            // System.out.println(o.add(5, 4));
             // 3.2 you can write code in one line 
             // if you returning only one value expression, then dont need to write retrun, java aoutomatic fetch 
            Inter o =  (i , j ) -> i +j;
            // you can direct call and print or store in variable like this
            int result =o.add(5, 5);
            System.out.println(result); 
            // Lambda Expression only work with functional interface

    }
}
