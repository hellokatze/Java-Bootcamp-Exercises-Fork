import model.Car;
import static model.Car.BodyType.*; // static import of every field inside of BodyType enum

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);
        System.out.println(car1.getMake());


    // Uncomment the following line to test invalid input for setMake method
    car1.setMake("Nissan");


    // Uncomment the following line to test invalid input for setModel method
    car1.setModel("Ultra");


    // Uncomment the following line to test invalid input for setBodyType method
    car1.setBodyType(SUV);


    // Uncomment the following line to test invalid input for setProductionYear method
    car1.setProductionYear(2022);


    // Uncomment the following line to test invalid input for setPrice method
    car1.setPrice(2000);


    // Uncomment the following line to test invalid input for setPrice method
    car1.setPrice(20000);


    // Uncomment the following line to test invalid input for the constructor
    Car car2 = new Car("Toyota", "Camry", SEDAN, 2020, 30000);

    }
}
