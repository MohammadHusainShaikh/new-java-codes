class Human{
    private int age;
    private String name;
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
       // we cannot assign the value outseide the class becouse variable are private
        // h.age=11;
        // h.name="Husain";
         // we can assign the value by method define in the same class where variable are defined
        h.setAge(30);
        h.setName("Husain");
        // we cannot directly achive or catch the data outeside the class because variable are pievate.
        // but indirectly we can do that by using method defind in samae class where variable are defined 
        System.out.println("Name:"+h.getName()+" | age:"+h.getAge());
        
    }
}
