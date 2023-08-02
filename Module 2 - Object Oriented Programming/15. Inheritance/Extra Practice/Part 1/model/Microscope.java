package model;

public class Microscope extends LabEquipment {

  private int magnification;

  public static final int MIN_MAG = 1;

  public Microscope(String manufacturer, String model, int year, int magnification) {
    super(manufacturer, model, year);
    setMagnification(magnification);
  }

  public int getMagnification() {
    return this.magnification;
  }

  public void setMagnification(int magnification) {
    if (magnification < 1) {
      throw new IllegalArgumentException("Magnification must be at least " + MIN_MAG + ".");
    }
    this.magnification = magnification;
  }

}
