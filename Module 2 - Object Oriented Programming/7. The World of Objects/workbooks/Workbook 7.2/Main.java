import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};

        System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality + "\n" + "Date of birth: " + person.dateOfBirth + "\n" + "Seat number: " + person.seatNumber);

    }


}
