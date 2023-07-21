public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2020, "green");
    // nissan.make = "Nissan";
    // nissan.price = 10000;
    // nissan.year = 2020;
    // nissan.color = "green";

    Car nissan2 = new Car(nissan);
    nissan2.setColor("Yellow");
    // nissan and nissan2 share a reference to the exact same object. One object can be updated through two different variables.
    // Car nissan2 = nissan;

    Car dodge = new Car("Dodge", 11000, 2019, "blue");
    // dodge.make = "Dodge";
    // dodge.price = 11000;
    // dodge.year = 2019;
    // dodge.color = "blue";

    nissan2.drive();

    nissan.setColor("Jet black");
    dodge.setColor("Jet black");
    nissan.setPrice(nissan.getPrice() / 2);
    dodge.setPrice(dodge.getPrice() / 2);

    System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
    ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
    System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
    ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
  }
}