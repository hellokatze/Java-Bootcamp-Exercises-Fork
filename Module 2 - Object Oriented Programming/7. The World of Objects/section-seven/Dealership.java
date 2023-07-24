import java.util.Arrays;

public class Dealership {
  private Car[] cars;

  public Dealership(Car[] cars) {
    // this is a deep copy
    this.cars = new Car[cars.length];
    for (int i = 0; i < this.cars.length; i++) {
      this.cars[i] = new Car(cars[i]);
    }
    this.cars = Arrays.copyOf(cars, cars.length);
  }

  public Car getCar(int index) {
    Car copy = new Car(this.cars[index]);
    return copy;
  }

  public void setCar(int index, Car newCar) {
    Car copy = new Car(newCar); // creates a copy of newCar
    this.cars[index] = copy;
  }

  public void sell(int index) {
    this.cars[index].drive();
  }

  public String toString() {
    String temp = "";
    for (int i = 0; i < this.cars.length; i++) {
        temp += "Parking Spot: " + i + "\n";
        String carDescription = this.cars[i].toString();
        temp += carDescription + "\n";
    }
    return temp;
}

}
