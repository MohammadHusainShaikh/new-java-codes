enum Status
{
    Running, Feild, Pending, Success;
}
public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());// This will get order number of object
        Status[] ss = Status.values();// to get all values
        System.out.println(ss[2]);
        for(Status  n : ss){ // to print all 
            System.out.println(n +" : "+ n.ordinal());
        } 
        // 1 . if else in enum
            // if(s == Status.Running)
            //     System.out.println("All good");
            // else if(s == Status.Feild)
            //     System.out.println("Try Again");
            // else if(s == Status.Pending)
            //     System.out.println("Please wait");
            // else
            //     System.out.println("Done");
        // 2. Switch in enum
        Status s1 = Status.Feild;
            switch(s1){
                case Running:
                    System.out.println("All good");
                break; 
                case Feild:
                    System.out.println("Try Again");
                    break;
                case Pending:
                    System.out.println("Please wait");
                    break;
                default:
                    System.out.println("done");
            }
            System.out.println(s.getClass().getName());// it will return current class name
            System.out.println(s.getClass().getSuperclass());// return Super class
        
    }
}
