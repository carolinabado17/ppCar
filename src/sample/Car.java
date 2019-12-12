package sample;

import java.util.Date;

/**
 * Final class Car that extends to another concrete class Vehicle. it displays feature as well as
 * other characteristics from class Vehicle.
 *
 * @author carolinabado
 */

public final class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  /**
   * Default constructor for Car().
   */
  public Car() {
    super();
    Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = f;
    this.carAxle = 2;

  }

  /**
   * Overloaded constructor including Vehicle class.
   *
   * @param vehicleManufacturer     - vehicle manufacturer
   * @param vehicleManufacturedDate - when the engine  was manufactured (date)
   * @param vehicleMake             - the make of the vehicle
   * @param vehicleModel            - the vehicle model
   * @param vehicleType             - the vehicle type
   * @param vehicleFrame            - the vehicle frame
   * @param vehicleEngine           - the engine of the vehicle
   * @param feature                 - the features (exterior and interior)
   * @param carAxle                 - the brod that connects wheels (car Axle)
   */

  public Car(String vehicleManufacturer,
      Date vehicleManufacturedDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {

    super(vehicleManufacturer, vehicleManufacturedDate, vehicleMake,
        vehicleModel, vehicleType, vehicleFrame, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;

  }

  /**
   * Gets the exterior features and transfer them to display them.
   *
   * @return - exterior feature of the vehicle
   */

  public String getExteriorFeatures() {
    String list = "";

    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n : " + this.feature[i];
        }
      }
    }
    return list;
  }

  /**
   * Gets the interior features and then transfer them to display them.
   *
   * @return - interior features of the vehicle.
   */

  public String getInteriorFeatures() {
    String list = "";

    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n : " + this.feature[i];
        }
      }
    }
    return list;
  }

  /**
   * toString() method that converts into to String that other classes display.
   *
   * @return - returns exterior and interior features.
   */

  public String toString() {
    String list = "";

    for (int i = 0; i < this.feature.length; i++) {
      if (list.length() == 0) {
        list += this.feature[i];
      } else {
        list += "\n : " + this.feature[i];
      }
    }
    return super.toString() + "\n"
        + "Feature: " + list + "\n"
        + "Car Axle: " + carAxle;

  }

  /**
   * Tests the cars and prints out the features and car Axle.
   *
   * @param args - the command line argument
   */

  public static void main(String[] args) {
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println("\n");

    Feature[] f = {new InteriorFeature("AM/FM Radio"),
        new ExteriorFeature("Wood Panels"),
        new InteriorFeature("Air Conditioning"),
        new ExteriorFeature("Moonroof")};

    Car c2 = new Car("Honda",
        new Date(),
        "Honda",
        "Prelude",
        "Coupe",
        new VehicleChassis("Unibody"),
        new ManufacturedEngine("Honda",
            new Date(),
            "H-Series",
            "H23A1",
            4,
            "88 AKI",
            "2WD: Two-Wheel Drive"),
        f,
        2);
    System.out.println(c2);
    System.out.println("\n");
    Vehicle v = (Vehicle) new Car("Honda",
        new Date(),
        "Honda",
        "Prelude",
        "Coupe",
        new VehicleChassis("Unibody"),
        new ManufacturedEngine("Honda",
            new Date(),
            "H-Series",
            "H23A1",
            4,
            "88 AKI",
            "2WD: Two-Wheel Drive"),
        f,
        2);
    System.out.println(((Car) v).getExteriorFeatures());
    System.out.println("\n");
    System.out.println("Exterior Features: "
        + c2.getExteriorFeatures());
    System.out.println("Interior Features: "
        + c2.getInteriorFeatures());
  }

}
