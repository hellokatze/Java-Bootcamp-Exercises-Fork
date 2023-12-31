package product;

public abstract class Product {
  // an abstract class can't be instantiated. The only purpose of abstract class is to provide inheritance to its children.
  private double price;
  private String color;
  private String brand;

  public Product(double price, String color, String brand) {
    this.price = price;
    this.color = color;
    this.brand = brand;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void fold() {
    System.out.println("Folding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    // this points to current object, name of the class from which the object was
    // created.
  }

  // can only define abstract methods inside an abstract class
  public abstract void wear();
  
}
