package sample;

/**
 * Concrete class for the exterior features of the car, implements the getters and setters from
 * Feature.
 *
 * @author carolinabado
 */
public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  /** Default Constructor for ExteriorFeature. */
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  /**
   * Overloaded constructor for Exterior Features.
   *
   * @param exteriorFeature - the exterior feature.
   */
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  /**
   * Override the toString() Method.
   *
   * @return Displays the exterior feature from Feature.
   */
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  /**
   * Main method that creates an instance of the variable and tests the data. Prints it out on the
   * console. Checks the data for the exterior feature.
   *
   * @param args - the command line argument
   */
  public static void main(String[] args) {
    ExteriorFeature extFeature = new ExteriorFeature();
    System.out.println(extFeature);
    System.out.println("\n");
    ExteriorFeature extFeature2 = new ExteriorFeature("Fog Lamps");
    System.out.println(extFeature2);
  }
}
