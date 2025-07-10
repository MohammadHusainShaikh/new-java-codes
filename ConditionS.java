import java.util.Scanner;

public class ConditionS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Sid ;
        String Sname;
        float Smark;
        System.out.println("Enter Student Student id");
        Sid = sc.nextInt();
        System.out.println("Enter student name");
        Sname = sc.next();
        System.out.println("Enter Student mark");
        Smark = sc.nextFloat();
        sc.nextLine();
        System.out.println("Student Information");
        System.out.println(Sid);
        System.out.println(Sname);
        System.out.println(Smark);
    if(Smark == 35){
        System.out.println("Student is pass with grade D grade"+ " "+Smark);
    }else if (Smark >=60) {
        System.out.println("Student is pass with grade c grade");
    }else{
        System.out.println("Student is Fail");
    }

    sc.close();
    }
}
