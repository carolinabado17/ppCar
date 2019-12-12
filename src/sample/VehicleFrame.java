package sample;

/**
 * This class focuses on the vehicle frame and takes inputs from Chassis(interface).
 *
 * @author carolinabado
 */
public class VehicleFrame implements Chassis {

  String vehicleFrameType;

  /** Default constructor. */
  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  /**
   * Overloaded constructor for VehicleFrame.
   *
   * @param vehicleFrameType - the vehicle frame type.
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleChassis();
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    vehicleFrameType = vehicleChassis;
  }

  /**
   * Override to toString() method.
   *
   * @return - returns chassis and vehicleFrameType.
   */
  @Override
  public String toString() {
    return "Chassis: " + chassis + "\n" + "Vehicle Frame: " + vehicleFrameType;
  }
  /**
   * Main method that creates an instance of the variable and tests the data. Prints it out on the
   * console. Checks data for VehicleFrame().
   *
   * @param args - the command line argument
   */

  public static void main(String[] args) {
    VehicleFrame vehicleFrame = new VehicleFrame();
    System.out.println(vehicleFrame);
    vehicleFrame.setChassisType("Ladder Frame");
    System.out.println(vehicleFrame);
  }
}
