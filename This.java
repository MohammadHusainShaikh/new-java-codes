class Human{
    private int age ;
    private String name;
    //1. By object
    public void setAge(int age, Human o){
        Human obj = o;
        obj.age = age;
    }
    
    public int getAge(){
        return age;
    }
    //2. By this Keyword
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class This {
    public static void main(String[] args) {
        Human h= new Human();
        h.setAge(30,h);
        h.setName("lal");
        System.out.println(h.getName()+" : "+h.getAge());
        Human n = new Human();
        n.setAge(56, n);
        n.setName("ram");
        System.out.println(n.getName()+" : "+n.getAge());
       
    }
}
