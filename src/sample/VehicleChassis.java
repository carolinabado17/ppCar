package sample;

/**
 * This class access Chassis interface and gets its name and type and prints it out.
 *
 * @author carolinabado
 */
public class VehicleChassis implements Chassis {

  String chassisName;

  /**
   * Default constructor.
   */

  public VehicleChassis() {
    this.chassisName = chassis;
  }

  /**
   * Overloaded constructor for VehicleChassis.
   *
   * @param chassisName - the name of the chassis (frame).
   */

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleChassis();
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    chassisName = vehicleChassis;
  }

  @Override
  public String toString() {
    return "Chassis Name: " + chassisName;
  }

  /**
   * Main method that creates an instance of the variable and tests the data.
   * Prints it out on the console. Checks data for VehicleChassis() prints it out.
   *
   * @param args - the command line argument
   */

  public static void main(String[] args) {
    VehicleChassis vehicleChassis = new VehicleChassis();
    VehicleChassis vehicleChassis1 = new VehicleChassis("chassis name");
    System.out.println(vehicleChassis);
    System.out.println(vehicleChassis1);
  }

}
