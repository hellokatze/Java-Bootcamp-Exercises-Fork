package model;

import java.util.ArrayList;

public class Lab {

  private ArrayList<LabEquipment> labEquipments;

  public Lab() {
    this.labEquipments = new ArrayList<>();
  }

  public Lab(Lab source) {
    this.labEquipments = new ArrayList<>(source.labEquipments);
  }

  // can't just create a new LabEquipment object because LabEquipment is an abstract class that can't create objects.
  public LabEquipment getLabEquipment(int index) {
    return this.labEquipments.get(index).clone();
  }

  public void setLabEquipment(LabEquipment labEquipment, int index) {
    this.labEquipments.set(index, labEquipment.clone());
  }

  public void addLabEquipment(LabEquipment labEquipment) {
    this.labEquipments.add(labEquipment.clone());
  }
}
