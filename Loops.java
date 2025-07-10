public class Loops {
    public static void main(String args[]) {
        // 1. While loop
        int i = 1;
        while(i<4){
            System.out.println("Loop loping at "+i);
            int j = 1;
               while(j <=3){
                System.out.println("Mohammad Husain "+j);
                j++;
        }
            i++;
        }
        // 2. do while loop
        int k = 11;
        do{
            System.out.println("Do while's Hi "+k);
            k++;
        }while(k < 10);// curently it is false
        // 3. for loop
        for(int j =0; j<4; j++){
            System.out.println("for loops's Hi "+j +" "+ (j+4));
            //j++;  // if sratrt from erven(1) it will print only even numbers 
                 // if start form odd 0()) it print odd (my logic)
        }
          for(int a = 4; a>=1; a--){ // decrement
            System.out.println("i is = "+a);
            //a--; // if sratrt from erven(1) it will print only even numbers 
                // if start form odd 0()) it print odd (my logic)
        }
        // for(int a = 1; a<= 5; a++){
        //     System.out.println("Day"+a);
        //     for(int b =1; b<=9; b++){
        //         System.out.println(" "+(b+8)+" - "+(b+9));
        //     }
            
        // }
     
    }
}
