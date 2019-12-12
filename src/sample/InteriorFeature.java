package sample;

/**
 * Concrete class for interior feature of the vehicle.
 *
 * @author carolinabado
 */
public class InteriorFeature implements Feature {

  private String interiorFeature;

  /** Default constructor, initializes Feature. */
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * Overloaded constructor for InteriorFeature.
   *
   * @param interiorFeature - interior features of the car.
   */
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return this.interiorFeature;
  }

  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  /**
   * Override the toString() Method.
   *
   * @return Displays the interior feature from Feature.
   */
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

  /**
   * Main method that creates an instance of the variable and tests the data. Prints it out on the
   * console. Checks the data for interior features.
   *
   * @param args - the command line argument
   */
  public static void main(String[] args) {
    InteriorFeature intFeature1 = new InteriorFeature();
    System.out.println(intFeature1);
    System.out.println("\n");
    InteriorFeature intFeature2 = new InteriorFeature("Climate Control");
    System.out.println(intFeature2);
  }
}
