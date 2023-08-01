import static model.Car.*;

public class Main {
    public static void main(String[] args) {

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
      String capitalized = string.toUpperCase();
      try {
        BodyType.valueOf(capitalized);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid body type: " + capitalized);
      }
      return true;
    }
}
