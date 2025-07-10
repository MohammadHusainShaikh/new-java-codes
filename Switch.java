import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String day = "";
    System.out.println("Select a day in week");
    System.out.println("1:Mon \n2:Tue\n3:Wed\n4:Thu\n5:Fry\n6:Sat\n7:Sun");
    day = sc.next();
    switch (day) {
        case "Mon":
        System.out.println("Your selected day Monday");        
            break;
            case "Tue":
        System.out.println("Your selected day Tuesday");        
            break;
            case "Wed":
        System.out.println("Your selected day Wednesday");        
            break;
        case "Thu":
        System.out.println("Your selected day Thursday");        
            break;
        case "Fri":
        System.out.println("Your selected day Friday");        
            break;
        case "Sat":
        System.out.println("Your selected day Saterday");        
            break;
        case "Sun":
        System.out.println("Your selected day Sunday");        
            break;
         default:
        System.out.println("You Selected worng value Select right day");
            
    }
// you can also use updated switch 1
// switch(day){
//         case  "Mon","Tue","Wed"->System.out.println("You have to wake up to 6am");
//         case "Thu","Fri","Sat"->System.out.println("You have to wake up to 9am");
//         case "Sun"->System.out.println("11am");
//         default->System.out.println("worng value");
//     }
// updat 2 you can use switch as an expression, instead of printing ypu can assign as follows
String result = " ";
switch(day){
        case  "Mon","Tue","Wed"->result="6am";
        case "Thu","Fri","Sat"->result="9am";
        case "Sun"->result="11am";
        default->System.out.println("worng value");
    }  
    System.out.println("Tou have to wake up at "+result);    

    // update insted of assigning the value multiple time we assing that to Switch
    result = switch(day){
        // case  "Mon","Tue","Wed"-> return"6am";
        //if you accepting value and not doing any expression in code do not need to wirte return
        case  "Mon","Tue","Wed"-> "6am";
        case "Thu","Fri","Sat"-> "9am";
        case "Sun"->"11am";
        default-> "worng value";
    };
        System.out.println("You have to wake up at "+result);
// if tou dont want to use switch as an expression and do not want to use 
// ->  you can use keyword (yield)

// result = switch (day) {
//     case  "Mon","Tue","Wed":yield "6am";
//     case  "Mon","Tue","Wed":yield"9am";
//     case  "Mon","Tue","Wed":yield"11am";
//     default:yield"wrong value";
        
// }:
// System.out.println(result);
// };

 sc.close();
}
}
