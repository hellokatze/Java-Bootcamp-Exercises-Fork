public class Contact {

  private String name;
  private String phoneNumber;
  private String birthdate;
  private int age;

  public Contact(String name, String phoneNumber, String birthdate, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birthdate = birthdate;
    this.age = age;
  }

  public Contact(Contact source) {
    this.name = source.name;
    this.phoneNumber = source.phoneNumber;
    this.birthdate = source.birthdate;
    this.age = source.age;
  }

}
