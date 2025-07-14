class Majoor{
     protected int age;
     protected String name;
    public Majoor()
    {
        System.out.println("In Defult Constructor");
        age = 23;
        name="Patnayak";
    }
    // public Majoor(String a,int n)
    // {// 1 java does not support same name constructor
        // 2 it suport but in them one should be default and second one should parametarized
        // 3 if two parameterized constructor then they sholud have different data type in their argument..
        // if they share same data type then swap them like in this constroctor and see lower one.  
    // }
    public Majoor(int a , String n)// paramatarized Counstructor
    {
        System.out.println("In Parametarized Constructor");
        age = a;
        name = n;
    }
    public Majoor(String name)
    {
        System.out.println("Another constructor one value assign and one passed");
        age = 34;
        // name = "Lala";this will override the value come frome argument/constructor
        this.name = name;
        // this.name = "Husain";// again this will set new value becouse java support top to bottom approch
    }
    public void show(){
    System.out.println("age:- "+ age+" | name:- "+name);
    System.out.println();
    }
}

public class Constructor {
    public static void main(String[] args) {
        Majoor m1 = new Majoor();
        m1.show();
        Majoor m = new Majoor(38,"Lal");
        m.show();
        Majoor m2 = new Majoor("Owais");
        m2.show();
        // we can directly assign data in main() becouse variable are not private
        System.out.println("in public class");
        m.age = 45;
        m.name="Navin";
        m.show();
        Majoor m3 = new Majoor(38,"dusri bar call kiya parametrized se");
        m3.show();
    }
   
}
