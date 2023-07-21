public class Car {
  private String make;
  private double price;
  private int year;
  private String color;

  public Car(String make, double price, int year, String color) {
    this.make = make; // the make parameter in the constructor refers to the object field make.
    this.price = price;
    this.year = year;
    this.color = color;
  }

  public Car(Car source) {
    // update the new object's fields with the values from source object.
    this.make = source.make;
    this.price = source.price;
    this.year = source.year;
    this.color = source.color;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void drive() {
    System.out.println("You bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
    System.out.println("Please drive your car to the nearest exit.");
  }
}

// A class is a blueprint that can create many car objects.