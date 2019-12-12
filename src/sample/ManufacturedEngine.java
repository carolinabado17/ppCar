package sample;

import java.util.Date;

/**
 * Class holds all the features for the implemented interface Engine.
 *
 * @author carolinabado
 */

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   * Constructor that initializes with Generics for objects on interface Engine.
   */
  public ManufacturedEngine() {

    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drive";

  }

  /**
   * Overloaded constructor for the objects Interface Engine.
   *
   * @param engineManufacturer     - the engine manufacturer
   * @param engineManufacturedDate - when the engine was manufactured (date)
   * @param engineMake             - the engine make
   * @param engineModel            - the model of the engine
   * @param engineCylinders        - the number of cylinders
   * @param engineType             - the engine type
   * @param driveTrain             - the power of the driving wheels
   */

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake,
      String engineModel, int engineCylinders, String engineType, String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;

  }


  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;

  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;

  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;

  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;

  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;

  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;

  }

  /**
   * Override the toString() Method.
   *
   * @return Displays each description of the Engine class.
   */
  @Override
  public String toString() {
    return "Engine Manufacturer: " + engineManufacturer + "\n"
        + "Engine Manufactured: " + engineManufacturedDate + "\n"
        + "Engine Make: " + engineMake + "\n"
        + "Engine Model: " + engineModel + "\n"
        + "Engine Type: " + engineType + "\n"
        + "Engine Cylinders: " + engineCylinders + "\n"
        + "Drive Train: " + driveTrain;
  }
  /**
   * Main method that creates an instance of the variable and tests the data.
   * Prints it out on the console. Checks the data for the ManufacturedEngine.
   *
   * @param args - the command line argument
   */

  public static void main(String[] args) {
    ManufacturedEngine manEng1 = new ManufacturedEngine();
    System.out.println(manEng1);
    System.out.println("\n");
    ManufacturedEngine manEng2 = new ManufacturedEngine("Honda",
        new Date(),
        "H-Series",
        "H23AI",
        4,
        "88 AKI",
        "2WD: Two-Wheel Drive");
    System.out.println(manEng2);
  }

}
