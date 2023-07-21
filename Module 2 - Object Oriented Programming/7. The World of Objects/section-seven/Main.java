public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2020, "green");
    // nissan.make = "Nissan";
    // nissan.price = 10000;
    // nissan.year = 2020;
    // nissan.color = "green";

    Car dodge = new Car("Dodge", 11000, 2019, "blue");
    // dodge.make = "Dodge";
    // dodge.price = 11000;
    // dodge.year = 2019;
    // dodge.color = "blue";

    System.out.println("This " + nissan.make + " is worth $" + nissan.price +
    ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    System.out.println("This " + dodge.make + " is worth $" + dodge.price +
    ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
  }
}
