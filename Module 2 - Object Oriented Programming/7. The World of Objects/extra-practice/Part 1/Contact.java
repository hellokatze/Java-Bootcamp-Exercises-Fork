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

  public String getBirthdate() {
    return this.birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
