public class Car {
    private String name;
    private String color;
    private String size;
    private double price;


    public Car(){
        this.name = "";
        this.color = "";
        this.size = "";
        this.price = 0.00;
   }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSize(String size){
        this.size=size;
    }

    public String getSize(){
        return this.size;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }

    public void  setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }


    public Car(String name, String color, String size, double price ){
        this.name= name;
        this.color = color;
        this.size = size;
        this.price = price;


    }


    public void move(){
        System.out.println(this.name + " is moving...");
    }

     public void makesound () {
         System.out.println(this.name + " is making sound...");
     }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
    };

}
