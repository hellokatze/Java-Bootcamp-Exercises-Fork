public class Car {
  String make;
  double price;
  int year;
  String color;

  public Car(String make, double price, int year, String color) {
    this.make = make; // the make parameter in the constructor refers to the object field make.
    this.price = price;
    this.year = year;
    this.color = color;
  }
}

// A class is a blueprint that can create many car objects.
