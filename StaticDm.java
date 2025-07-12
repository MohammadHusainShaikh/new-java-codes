class Mobile{
    String brand;
    int price;
    static String name; 
    // 3. Static block
    static{
        // if we dont have ane defination for static variable(name) in main method-
        //= then the follow one will be apply
        name = "Phone";
        System.out.println("In Static block");
    }
    public Mobile(){
        brand = "";
        price =2000;
        System.out.println("In Constructor");
        // System.out.println(brand);
        // System.out.println(price);
    }
    // 1
    public void show(){
        // in non static method you can use static variable(name).
        System.out.println(brand +" :"+price+" :"+name);
    }
    // 2. Static Method
    public static void show1(Mobile o){
        // you can use static variable inside static method(name)
        //to use non static variable we pass object reference(Moblile.show1(o1)) and access that in here
        System.out.println(o.brand +" :"+o.price+" :"+name);
    }
}
public class StaticDm {
    public static void main(String[] args) throws ClassNotFoundException {
        //4. load class without any object / to do this you have comment out all the section in follow exept the first line
        // Class.forName("Mobile");
        Mobile o1 = new Mobile();
        o1.brand="Appel";
        o1.price=32000;
        // static varible can directly call thire class name becouse-
        // -static means you are making class member not a object member
        // Mobile.name="SmartPhone";
        Mobile o2 = new Mobile();
        o2.brand="Samsung";
        o2.price=1500;
        // Mobile.name="SmartPhone";
        Mobile o3 = new Mobile();
        o3.brand="Vivo";
        o3.price=2300;
        // Mobile.name="SmartPhone";
        // Mobile.name="phone";
        // the at last value we define for static variable it will be apply for all the name
        // currently it is phone in follow line it will be "mera".
       // Mobile.name="mera";
        o1.show();
        o2.show();

        // we can call static method by thier class name 
        //2. Mobile.show1(o1);
        
    }
    
    
}
