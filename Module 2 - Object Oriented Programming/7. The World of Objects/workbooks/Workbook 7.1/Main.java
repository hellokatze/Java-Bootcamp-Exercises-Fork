import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    
    Person henry = new Person();
    henry.name = "Henry";
    henry.nationality = "Romanian";
    henry.dateOfBirth = "05/06/2021";
    henry.passport = new String[]{henry.name, henry.nationality, henry.dateOfBirth};
    henry.seatNumber = 3;

    System.out.println(henry.name);
    System.out.println(henry.nationality);
    System.out.println(henry.dateOfBirth);
    System.out.println(Arrays.toString(henry.passport));
    System.out.println(henry.seatNumber);

  }
}
