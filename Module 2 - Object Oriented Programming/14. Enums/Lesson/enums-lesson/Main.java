import model.Car;
import static model.Car.TrafficLight.*; // allows us to use TrafficLight enum directly without having to write out class name.

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(RED);
    }

}
