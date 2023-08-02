import static model.Car.*;
import java.util.Scanner;

import model.Car;
import model.Car.BodyType;
import model.CarDealership;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


      String make = promptForMake(scanner);
      String model = promptForModel(scanner);
      BodyType bodyType = promptForBodyType(scanner);
      int year = promptForYear(scanner);
      double price = promptForPrice(scanner);


      Car newCar = new Car(make, model, bodyType, year, price);


      CarDealership dealership = new CarDealership();
      dealership.addCar(newCar);


      System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());

    }

    public static boolean isNullOrBlank(String input) {
      return input == null || input.isBlank();
    }

    public static boolean invalidYear(int year) {
      return year < MIN_YEAR;
    }

    public static boolean invalidPrice(double price) {
      return price < MIN_PRICE || price > MAX_PRICE;
    }

    public static boolean invalidBodyType(String string) {
      try {
        BodyType.valueOf(string.toUpperCase());
        return false;
      } catch (IllegalArgumentException e) { // we catch the IllegalArgumentException so that it doesn't break the app.
        System.out.println("Invalid body type: " + string);
      }
      return true;
    }

    public static BodyType promptForBodyType(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid car body type: ");
        String bodyType = scanner.nextLine();
        // TODO
        if (!invalidBodyType(bodyType)) {
          return BodyType.valueOf(bodyType.toUpperCase());
        }
      }
    }

    public static String promptForMake(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid car make: ");
        String make = scanner.nextLine();
        // TODO
        if (!isNullOrBlank(make)) {
          return make;
        }
      }
    }

    public static String promptForModel(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid car model: ");
        String model = scanner.nextLine();
        // TODO
        if (!isNullOrBlank(model)) {
          return model;
        }
      }
    }

    public static int promptForYear(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid production year: ");
        // TODO
        if (!scanner.hasNextInt()) {
          scanner.next(); // this consumes invalid input data
          continue; // continue to the next iteration of the while loop.
        }

        int year = scanner.nextInt();
        if (!invalidYear(year)) {
          return year;
        }
      }
    }

    public static double promptForPrice(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid car price: ");
        // TODO
        if (!scanner.hasNextDouble()) {
          scanner.next(); // this consumes invalid input data
          continue; // continue to the next iteration of the while loop.
        }

        double price = scanner.nextDouble();
        if (!invalidPrice(price)) {
          return price;
        }
      }
    }
}
