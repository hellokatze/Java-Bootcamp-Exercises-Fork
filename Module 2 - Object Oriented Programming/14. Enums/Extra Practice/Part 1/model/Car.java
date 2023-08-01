package model;

public class Car {
  private String make;
  private String model;
  public enum BodyType {
    SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN;
  }
  private int productionYear;
  private double price;
  public static final int MIN_PROD_YEAR = 1900;
  public static final double MIN_PRICE = 0;
  public static final double MAX_PRICE = 200000;

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    if (make == null || make.isBlank()) throw new IllegalArgumentException("Make can't be null or blank.");
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    if (model == null || model.isBlank()) throw new IllegalArgumentException("Model can't be null or blank.");
    this.model = model;
  }

  public String getBodyType() {
    return this.BodyType;
  }

  public void setBodyType(BodyType bodyType) {
    if (bodyType == null) throw new IllegalArgumentException("Body type can't be null.");
    this.BodyType = bodyType;
  }

  public int getProductionYear() {
    return this.productionYear;
  }

  public void setProductionYear(int year) {
    if (year < MIN_PROD_YEAR) throw new IllegalArgumentException("Production year must be greater than or equal to " + MIN_PROD_YEAR + ".");
    this.productionYear = year;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    if (price < MIN_PRICE || price > MAX_PRICE) throw new IllegalArgumentException("Price must be between " + MIN_PRICE + " and " + MAX_PRICE + ".");
  }

}
