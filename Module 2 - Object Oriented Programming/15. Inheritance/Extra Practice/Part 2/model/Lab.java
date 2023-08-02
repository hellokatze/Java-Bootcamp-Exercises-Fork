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

}
