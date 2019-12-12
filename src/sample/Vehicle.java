package sample;

import java.util.Date;

/**
 * Class Vehicle takes all features from Engine and Chassis.
 *
 * @author carolinabado
 */
public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  /** Default constructor for generic values. Initializes all of the objects. */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleType = "None";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("88 AKI");
    this.vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
  }

  /**
   * Overloaded constructor for Vehicle().
   *
   * @param vehicleManufacturer - the manufacturer of the vehicle.
   * @param vehicleManufacturedDate - the date the manufactured was made.
   * @param vehicleMake - the make of the vehicle.
   * @param vehicleModel - the model of the vehicle.
   * @param vehicleType - the vehicle type.
   * @param vehicleFrame - the frame of the vehicle.
   * @param engine - the engine.
   */
  public Vehicle(
      String vehicleManufacturer,
      Date vehicleManufacturedDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine engine) {

    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleType = vehicleType;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = engine;
  }

  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  /**
   * Override the toString() method.
   *
   * @return Displays each feature from the Vehicle class.
   */
  public String toString() {
    return "Manufacturer Name: "
        + this.vehicleManufacturer
        + "\n"
        + "Manufactured Date: "
        + this.vehicleManufacturedDate.toString()
        + "\n"
        + "Vehicle Make: "
        + this.vehicleMake
        + "\n"
        + "Vehicle Model: "
        + this.vehicleModel
        + "\n"
        + "Vehicle Type: "
        + this.vehicleType
        + "\n"
        + vehicleEngine.toString();
  }

  /**
   * Main method that creates an instance of the variable and tests the data. Prints it out on the
   * console. Checks data for Vehicle().
   *
   * @param args - the command line argument
   */
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    System.out.println(v1);
    System.out.println("\n");
    Vehicle v2 =
        new Vehicle(
            "Honda",
            new Date(),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"));
    System.out.println(v2);
    System.out.println("\n");
    v2.setEngineCylinders(6);
    System.out.println(v2);
  }
}
