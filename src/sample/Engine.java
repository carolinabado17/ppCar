package sample;

import java.util.Date;

/**
 * Holds the setters and getters for the Engine features of the vehicle.
 *
 * @author carolinabado
 */
public interface Engine {

  void setEngineCylinders(int engineCylinders);

  void setEngineManufacturedDate(Date date);

  void setEngineManufacturer(String manufacturer);

  void setEngineMake(String engineMake);

  void setEngineModel(String engineModel);

  void setDriveTrain(String driveTrain);

  void setEngineType(String fuel);

}
