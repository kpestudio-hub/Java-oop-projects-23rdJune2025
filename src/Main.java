public class Main {
    public static void main(String[] args) {


        // creating the object
        Car carObj = new Car();


        // setting values for the object's attribute
        carObj.setName("Toyota");
        carObj.setColor("Black");
        carObj.setSize("Large");
        carObj.setPrice(1000.123);

        // dsiplaying  the attributes on the object
       carObj.printInfo();

        System.out.println();

        // create 1 object
            // set values for the object
        // displaying the objects info

        Car carObj1 = new Car ("Benz", "blue", "big", 10000.95);
       carObj1.printInfo();



    }
}