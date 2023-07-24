import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = this.toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
      return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
      this.birthDate = birthDate;
      this.setAge(this.toAge(birthDate));
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge(String birthdate) {
      DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate date = LocalDate.parse(birthdate, dateFormatter);
      LocalDate currentDate = LocalDate.now();

      Period period = Period.between(date, currentDate);

      int age = period.getYears();

      return age;
    }

}
