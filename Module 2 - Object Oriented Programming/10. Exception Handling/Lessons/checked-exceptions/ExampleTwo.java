import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("greetings.txt");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process complete!");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException { // throws indicates that this is the code that might trigger FileNotFoundException.
        FileInputStream fis = new FileInputStream("greetings.txt");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
