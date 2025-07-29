// more on enum in java
enum Laptop 
{
    Mackbook(20000), Thinkpad(69300), Surface, XPS(522222);
   
    
        private int price;

        private Laptop(int price) {
          
           this.price = price;
           System.out.println("in Laptop with value "+this.name());
        }

        private Laptop() {
              // if your consuctor not have any price(value) then default it will 0 by creating constroctor 
            // otherwise it will error if do nat create any default constructor
            price = 300;
            System.out.println("in defult "+this.name());
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
         
    
}
public class EnumMore {
    public static void main(String[] args) {
        Laptop lap = Laptop.Mackbook;
        //  System.out.println(lap);  
        //  System.out.println(lap +" : "+ lap.getPrice()); 
        for(Laptop l : Laptop.values()){
            System.out.println(l+ " : "+ l.getPrice());
        }
        //to set new price
        lap.setPrice(8);
        System.out.println(lap+" : "+ lap.getPrice()+ " , "+lap.name());
    }
}
