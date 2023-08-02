import product.Shirt;
import product.Shirt.Size;
import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {
      // Product product = new Product(8.99, "blue", "No name"); // doesn't make sense to create an object of the product class.
      Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);
      shirt.fold();
      productStore(shirt);

      Pants pants = new Pants(49.99, "Black", "Levi's", 32, 32);
      pants.fold();
      productStore(pants);

    }

    public static void productStore(Product product) {
      System.out.println("\nThank you for purchasing this " + product.getBrand().toLowerCase() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice());
      product.wear();
    }

}
