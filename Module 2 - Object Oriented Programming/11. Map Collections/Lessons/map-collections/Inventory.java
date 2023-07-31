import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static void main(String[] args) {

        Map<String, Double> inventory = new HashMap<>();
        inventory.put("Bananas", 2.99); // any collection of type Map can call put method, which accepts key-value pair.
        inventory.put("Papaya", 5.99); // with addition of first key-value pair, a 16-element array with null gets created.
        inventory.put("Kale", 4.99); // a function processes key and returns integer hash numerical value.
        inventory.put("Apples", 1.99); // bitwise operation on the hash value determines index on where key-value pair is going to be stored.
        inventory.put("Carrot", 1.49); // element at the index stores reference to a node, which stores key-value entry.

        inventory.put("Lime", 0.49);
        inventory.put("Toothpaste", 5.99);
        inventory.put("Zucchini", 5.99);

        System.out.println("\nWelcome to Java Grocers. What can we help you find?:\n");

        System.out.println("\nWhat is the price of Lime?");
        System.out.println(inventory.get("Lime"));

        System.out.println("\nWhat is the price of Zucchini?");
        System.out.println(inventory.get("Zucchini"));

        System.out.println("\nWhat is the price of Kale?");
        System.out.println(inventory.get("Kale"));


        System.out.println("\nDo you guys sell Apples?");
        boolean result = inventory.containsKey("Apples");
        String response = result ? "Yes!" : "No, sorry!";
        System.out.println(response);

    }
}
